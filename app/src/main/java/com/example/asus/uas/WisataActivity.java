package com.example.asus.uas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class WisataActivity extends AppCompatActivity {

    private Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        myButton = (Button) findViewById(R.id.semeru); //memanggil tombol butProfil
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i12 = new Intent(getApplicationContext(), SemeruActivity.class);
                startActivity(i12);
            }
        });

        myButton = (Button) findViewById(R.id.bromo); //memanggil tombol butProfil
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i12 = new Intent(getApplicationContext(), BromoActivity.class);
                startActivity(i12);
            }
        });

        myButton = (Button) findViewById(R.id.sewu); //memanggil tombol butProfil
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i12 = new Intent(getApplicationContext(), SewuActivity.class);
                startActivity(i12);
            }
        });

        myButton = (Button) findViewById(R.id.bale); //memanggil tombol butProfil
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i12 = new Intent(getApplicationContext(), BaleActivity.class);
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
