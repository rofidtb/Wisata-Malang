package com.example.asus.uas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;

public class WelcomeActivity extends AppCompatActivity {

    SessionManagement sessionManagement;
    private Button butwialam, butwisko, butGaleri, butVideo;
    TextView tvEmail;
    Button butLog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        sessionManagement = new SessionManagement(WelcomeActivity.this);
        butLog = findViewById(R.id.buttonLogout);
        tvEmail = findViewById(R.id.tvEmail);

        sessionManagement = new SessionManagement(WelcomeActivity.this);
        if (sessionManagement.isLoggedIn())
        {
            HashMap<String, String> user = sessionManagement.getUserInformation();
            tvEmail.setText(user.get(sessionManagement.KEY_EMAIL));
        }
        butLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sessionManagement.logoutUser();
            }
        });

        butwialam = (Button)findViewById(R.id.wialam);
        butwisko = (Button)findViewById(R.id.wiskota);
        butGaleri = (Button)findViewById(R.id.galeri);
        butVideo = (Button)findViewById(R.id.vid);


        butwialam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), WisataActivity.class); //membut intent button wisata alam berpindah ke halaman Wisata Alam
                startActivity(i);
            }
        });

        butwisko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(), TamnasActivity.class);
                startActivity(i2);
            }
        });
        butGaleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(), GaleryActivity.class);
                startActivity(i2);
            }
        });
        butVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(), VideoActivity.class);
                startActivity(i2);
            }
        });
    }
    public  void Logout (View view)
    {
        Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
