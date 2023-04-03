package com.example.androidartist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chest_choose extends AppCompatActivity {

    Button chest1, chest2, chest3, chest4;
    String choice = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_choose);

        chest1 = findViewById(R.id.chest1);
        chest2 = findViewById(R.id.chest2);
        chest3 = findViewById(R.id.chest3);
        chest4 = findViewById(R.id.chest4);

        Intent i2 = new Intent(chest_choose.this, splash_screen.class);

        chest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i2.putExtra("CHOICE", "1");
                startActivity(i2);
                finish();
            }
        });

        chest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i2.putExtra("CHOICE", "2");
                startActivity(i2);
                finish();
            }
        });

        chest3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i2.putExtra("CHOICE", "3");
                startActivity(i2);
                finish();
            }
        });

        chest4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i2.putExtra("CHOICE", "4");
                startActivity(i2);
                finish();
            }
        });
    }
}