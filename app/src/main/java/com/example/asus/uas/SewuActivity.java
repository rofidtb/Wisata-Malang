package com.example.asus.uas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SewuActivity extends AppCompatActivity {

    private Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sewu);

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
                webIntent.setData(Uri.parse("https://www.google.com/maps/place/Tumpak+Sewu/@-8.2313152,112.9159462,17z/data=!3m1!4b1!4m5!3m4!1s0x2dd613dff52fbb09:0x7f7884bb77b2b01f!8m2!3d-8.2313152!4d112.9181349")); //memanggil link lokasi
                startActivity(webIntent);
            }
        });
    }
}
