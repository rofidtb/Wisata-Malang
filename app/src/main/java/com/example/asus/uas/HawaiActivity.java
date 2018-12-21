package com.example.asus.uas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HawaiActivity extends AppCompatActivity {

    private Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hawai);

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
                webIntent.setData(Uri.parse("https://www.google.com/maps/place/Hawai+Water+Park/@-7.923462,112.6560643,17z/data=!3m1!4b1!4m5!3m4!1s0x2dd62986638c712f:0x6f6ab564e7eda69d!8m2!3d-7.923462!4d112.658253"));
                startActivity(webIntent);
            }
        });
    }
}
