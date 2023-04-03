package com.example.androidartist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Intent intent = getIntent();
        String choice = intent.getStringExtra("CHOICE");

        int secondsDelayed = 3;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                if(choice.equals("1")){
                    startActivity(new Intent(splash_screen.this, Quest1.class));
                    finish();
                }

                if(choice.equals("2")){
                    startActivity(new Intent(splash_screen.this, Quest2.class));
                }

                if(choice.equals("3")){
                    startActivity(new Intent(splash_screen.this, Quest3.class));
                }

                if(choice.equals("4")){
                    startActivity(new Intent(splash_screen.this, Quest4.class));
                }
            }
        }, secondsDelayed * 1000);
    }
}