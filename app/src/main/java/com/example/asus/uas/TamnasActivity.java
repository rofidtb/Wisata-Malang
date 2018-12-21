package com.example.asus.uas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TamnasActivity extends AppCompatActivity {

    private Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamnas);
        myButton = (Button) findViewById(R.id.alun); //memanggil tombol butProfil
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i12 = new Intent(getApplicationContext(), AlunActivity.class);
                startActivity(i12);
            }
        });

        myButton = (Button) findViewById(R.id.jodipan); //memanggil tombol butProfil
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i12 = new Intent(getApplicationContext(), JodipanActivity.class);
                startActivity(i12);
            }
        });

        myButton = (Button) findViewById(R.id.hawai); //memanggil tombol butProfil
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i12 = new Intent(getApplicationContext(), HawaiActivity.class);
                startActivity(i12);
            }
        });

        myButton = (Button) findViewById(R.id.jatim); //memanggil tombol butProfil
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i12 = new Intent(getApplicationContext(), JatimActivity.class);
                startActivity(i12);
            }
        });

        myButton = (Button) findViewById(R.id.kembali); //memanggil tombol butProfil
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i12 = new Intent(getApplicationContext(), WelcomeActivity.class);
                startActivity(i12);
            }
        });
    }
}
