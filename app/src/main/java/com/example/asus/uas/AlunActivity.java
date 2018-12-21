package com.example.asus.uas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AlunActivity extends AppCompatActivity {

    private Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alun);

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
                webIntent.setData(Uri.parse("https://www.google.com/maps/search/alun+alun+malang/@-7.9798298,112.6302439,17z/data=!3m1!4b1"));
                startActivity(webIntent);
            }
        });
    }
}
