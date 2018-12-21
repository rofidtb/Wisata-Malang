package com.example.asus.uas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class VideoActivity extends AppCompatActivity {

    Button semeru, bromo, sewu, bale, alun, jodipan, hawai, jp;
    private Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        Button sm = (Button) findViewById(R.id.semeru);
        Button br = (Button) findViewById(R.id.bromo);
        Button sw = (Button) findViewById(R.id.sewu);
        Button bk = (Button) findViewById(R.id.bale);
        Button aa = (Button) findViewById(R.id.alun);
        Button jd = (Button) findViewById(R.id.jodipan);
        Button hw = (Button) findViewById(R.id.hawai);
        Button jp = (Button) findViewById(R.id.jp);
        myButton = (Button) findViewById(R.id.back);

        sm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.youtube.com/watch?v=vzN209tTgk8"));
                startActivity(i);
            }
        });

        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.youtube.com/watch?v=3zcr5oR8154"));
                startActivity(i);
            }
        });

        sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.youtube.com/watch?v=uY4SnyH8JoQ"));
                startActivity(i);
            }
        });

        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.youtube.com/watch?v=4WDd2TKC8qg"));
                startActivity(i);
            }
        });

        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.youtube.com/watch?v=IHNzOHi8sJs"));
                startActivity(i);
            }
        });

        jd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.youtube.com/watch?v=q-yVxhT-320"));
                startActivity(i);
            }
        });

        hw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.youtube.com/watch?v=zTEYUFgLveY"));
                startActivity(i);
            }
        });

        jp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.youtube.com/watch?v=Hh9yZWeTmVM"));
                startActivity(i);
            }
        });

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (getApplicationContext(), WelcomeActivity.class);
                startActivity(i);
            }
        });
    }
}
