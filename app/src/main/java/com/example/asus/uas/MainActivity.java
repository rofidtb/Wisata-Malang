package com.example.asus.uas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myButton = (Button) findViewById(R.id.btnlog); //memanggil tombol butProfil
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i12 = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i12);
            }
        });

        myButton = (Button) findViewById(R.id.btnreg); //memanggil tombol butProfil
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), RegistrasiActivity.class);
                startActivity(i1);
            }
        });
    }

}
