package com.example.asus.uas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BromoActivity extends AppCompatActivity {

    private Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bromo);

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
                webIntent.setData(Uri.parse("https://www.google.com/maps/place/Gn.+Bromo/@-7.9424934,112.9442574,15z/data=!4m13!1m7!3m6!1s0x2dd637aaab794a41:0xada40d36ecd2a5dd!2sGn.+Bromo!3b1!8m2!3d-7.9424936!4d112.9530122!3m4!1s0x2dd636fe48e2b08b:0x19b75487127bd0c6!8m2!3d-7.9416679!4d112.9499996"));
                startActivity(webIntent);
            }
        });
    }
}
