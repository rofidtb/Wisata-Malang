package com.example.asus.uas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class JodipanActivity extends AppCompatActivity {

    private Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jodipan);

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
                webIntent.setData(Uri.parse("https://www.google.com/maps/place/Kampung+Warna+Warni+Jodipan/@-7.9877627,112.6329904,16z/data=!4m13!1m7!3m6!1s0x2dd628130950d33b:0x7d2d8b2680943f69!2sJodipan,+Blimbing,+Kota+Malang,+Jawa+Timur!3b1!8m2!3d-7.9883567!4d112.639978!3m4!1s0x2dd62813baaaaaab:0x2f2efc16d93c93e6!8m2!3d-7.9832212!4d112.6376322"));
                startActivity(webIntent);
            }
        });
    }
}
