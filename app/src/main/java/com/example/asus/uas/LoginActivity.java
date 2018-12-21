package com.example.asus.uas;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    DataHelper dbHelper;
    private Button logBut, kembaliBut;
    private EditText textPersonName, textPassword;

    SessionManagement sessionManagement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        dbHelper = new DataHelper(this);
        sessionManagement = new SessionManagement(this);
        textPersonName = (EditText) findViewById(R.id.editEmail);
        textPassword = (EditText) findViewById(R.id.editPassword);

        logBut = (Button) findViewById(R.id.butLogin);
        kembaliBut = (Button) findViewById(R.id.butBack);

        if (sessionManagement.isLoggedIn()) { //jika tidak di logout maka akan tetap berada di home
            goToActivity();
        }
        logBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CekLogin()) {
                    if (cekValidasi()) {
                        Toast.makeText(getApplicationContext(), "Benar", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(getApplicationContext(), WelcomeActivity.class);
                        sessionManagement.createLoginSession(textPersonName.getText().toString(), textPassword.getText().toString());

                        startActivity(i);
                        finish();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Anda belum terdaftar", Toast.LENGTH_SHORT).show();
                }
            }
        });
        kembaliBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i2);
            }
        });
    }

    public boolean CekLogin(){ //cek apakah sudah regis
        SessionManagement sessionManagement = new SessionManagement(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from wisata WHERE email ='"+textPersonName.getText().toString()+"' and password='"+textPassword.getText().toString()+"'", null);

        //sessionManagement.tampilkan(username.getText().toString(), cursor.getString(1).toString(), cursor.getString(2).toString(), password.getText().toString());
        sessionManagement.createLoginSession(textPersonName.getText().toString(),textPassword.getText().toString());

        if(cursor.getCount()>0) return true;
        else return false;
    }

    private boolean cekValidasi()
    {
        if (textPersonName.getText().toString().equals(""))
        {
            Toast.makeText(getApplicationContext(), "Email harus diisi", Toast.LENGTH_SHORT).show();
            return false;
        }

        else if (textPassword.getText().toString().equals(""))
        {
            Toast.makeText(getApplicationContext(), "Password harus diisi", Toast.LENGTH_SHORT).show();
            return false;
        }

        else
        {
            return true;
        }
    }

    private void goToActivity() {
        Intent mIntent = new Intent(getApplicationContext(),
                WelcomeActivity.class);
        startActivity(mIntent);
    }

}


