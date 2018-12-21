package com.example.asus.uas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SemeruActivity extends AppCompatActivity {

    private Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semeru);

        myButton = (Button) findViewById(R.id.back); //memanggil tombol butProfil
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i12 = new Intent(getApplicationContext(), TamnasActivity.class);
                startActivity(i12);
            }
        });

        myButton = (Button) findViewById(R.id.map); //memanggil tombol butProfil
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent webIntent = new Intent(Intent.ACTION_VIEW);
                webIntent.setData(Uri.parse("https://www.google.com/maps/place/Gn.+Semeru/@-8.107717,112.9136527,15z/data=!3m1!4b1!4m5!3m4!1s0x2dd63e89e1d817bb:0x9c14d4ed3c488f54!8m2!3d-8.1077172!4d112.9224075"));
                startActivity(webIntent);
            }
        });
    }
}
