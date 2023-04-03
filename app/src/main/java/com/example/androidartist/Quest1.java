package com.example.androidartist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Quest1 extends AppCompatActivity {
    EditText ans;
    Button Submit;
    ImageView img;
    int QueCount = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest1);

        ans = findViewById(R.id.ans);

        img = findViewById(R.id.imageView);

        Submit  = findViewById(R.id.submit);

        img.setImageResource(R.drawable.black_pearl);
        ans.setHint("2 Words, 5 letters and 7 letters");

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(QueCount == 1){
                    if((ans.getText().toString().trim().equalsIgnoreCase("Black Pearl"))){
                        QueCount++;
                        Toast.makeText(Quest1.this, "Correct Answer!", Toast.LENGTH_SHORT).show();
                        img.setImageResource(R.drawable.davy_jones);

                        //NEED TO EMPTY EDIT TEXTS!!!
                        clear();
                        ans.setHint("2 Words, 4 letters and 5 letters");

                    }

                    else{
                        Toast.makeText(Quest1.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                    }

                }
                else if(QueCount == 2){
                    //Yet to be made
                    if(ans.getText().toString().trim().equalsIgnoreCase("Davy Jones")){
                        QueCount++;
                        Toast.makeText(Quest1.this, "Correct Answer!", Toast.LENGTH_SHORT).show();
                        img.setImageResource(R.drawable.black_sparrow);

                        clear();
                        ans.setHint("2 Words, 5 letters and 7 letters");

                    }
                }

                else if(QueCount == 3){
                    if(ans.getText().toString().trim().equalsIgnoreCase("Black Sparrow")){
                        //Intent
                        Toast.makeText(Quest1.this, "Correct Answer!", Toast.LENGTH_SHORT).show();

                        startActivity(new Intent(Quest1.this, End_Screen.class));
                        finish();
                    }

                }
            }
        });


    }

    void clear(){
        ans.setText("");
    }
}