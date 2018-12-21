package com.example.asus.uas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class JatimActivity extends AppCompatActivity {

    private Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jatim);

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
                webIntent.setData(Uri.parse("https://www.google.com/maps/place/Jatim+Park+I,+Jl.+Dewi+Sartika+Atas,+Sisir,+Kec.+Batu,+Kota+Batu,+Jawa+Timur+65314/@-7.8841663,112.5238234,18z/data=!3m1!4b1!4m5!3m4!1s0x2e7880d52e0379d9:0x9c94d817cc2686bb!8m2!3d-7.8845017!4d112.5248818"));
                startActivity(webIntent);
            }
        });
    }
}
