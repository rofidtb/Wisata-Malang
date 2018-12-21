package com.example.asus.uas;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrasiActivity extends AppCompatActivity {

    Cursor cursor;
    DataHelper dbHelper;
    Button ton1, ton2;
    EditText text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        dbHelper = new DataHelper(this);
        text1 = (EditText) findViewById(R.id.editEmail);
        text2 = (EditText) findViewById(R.id.editPassword);
        ton1 = (Button) findViewById(R.id.buttonreg);
        ton2 = (Button) findViewById(R.id.butkembali);

        ton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.execSQL("insert into wisata(email, password) values('" +
                        text1.getText().toString() + "','" +
                        text2.getText().toString() + "')" );
                Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
                finish();
            }
        });
        ton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                finish();
            }
        });
    }
}
