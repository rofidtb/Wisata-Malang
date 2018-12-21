package com.example.asus.uas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BaleActivity extends AppCompatActivity {

    private Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bale);

        myButton = (Button) findViewById(R.id.back); //memanggil tombol kembali
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i12 = new Intent(getApplicationContext(), TamnasActivity.class);
                startActivity(i12);
            }
        });

        myButton = (Button) findViewById(R.id.map); //memanggil tombol map
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent webIntent = new Intent(Intent.ACTION_VIEW);
                webIntent.setData(Uri.parse("https://www.google.com/maps/place/Pantai+Balekambang/@-8.4035709,112.5306164,15z/data=!4m13!1m7!3m6!1s0x2e78a9458651084f:0x6b8da077d5b83e2f!2sPantai+Balekambang!3b1!8m2!3d-8.4034458!4d112.5391259!3m4!1s0x2e78a94f026115f7:0x832b7afc3f082b05!8m2!3d-8.4027237!4d112.5336859"));
                startActivity(webIntent);
            }
        });
    }
}
