package com.example.asus.uas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class GaleryActivity extends AppCompatActivity {

    private Button but1, but2, but3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery);
        but1 = (Button) findViewById(R.id.wialam);
        but2 = (Button) findViewById(R.id.wiskota);
        but3 = (Button) findViewById(R.id.kembali);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (getApplicationContext(), GalerialamActivity.class);
                startActivity(i);
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (getApplicationContext(), GalerikotaActivity.class);
                startActivity(i);
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (getApplicationContext(), WelcomeActivity.class);
                startActivity(i);
            }
        });
    }
}
