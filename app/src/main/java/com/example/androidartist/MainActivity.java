package com.example.androidartist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Bundle;
import android.text.Editable;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2,num3,num4;
    Button SignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);
        num3 = findViewById(R.id.number3);
        num4 = findViewById(R.id.number4);
        SignIn = findViewById(R.id.signIn);

        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input1 = " ";
                String input2 = " ";
                String input3 = " ";
                String input4 = " ";
                input1 = num1.getText().toString();
                input2 = num2.getText().toString();
                input3 = num3.getText().toString();
                input4 = num4.getText().toString();
                
                if(input1.equals(getString(R.string.pass1)) && input2.equals(getString(R.string.pass1)) && input3.equals(getString(R.string.pass1)) && input4.equals(getString(R.string.pass1))){
                    Toast.makeText(MainActivity.this, "Game Unlocked", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, chest_choose.class);
                    startActivity(i);
                    finish();
                }

                else{
                    Toast.makeText(MainActivity.this, "Incorrect Passcode", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}