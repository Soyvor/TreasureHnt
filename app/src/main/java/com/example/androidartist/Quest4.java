package com.example.androidartist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Quest4 extends AppCompatActivity {

    TextView questions;
    EditText answer;
    Button submit;
    int QueCount = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest4);

        questions = findViewById(R.id.question4);
        answer = findViewById(R.id.answer4);
        submit = findViewById(R.id.button4);



        questions.setText("What was the name of Harry's owl ");
        answer.setHint("1 word, 6 letters");

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(QueCount == 1){
                    if(answer.getText().toString().trim().equalsIgnoreCase("Hedwig")){
                        QueCount++;
                        Toast.makeText(Quest4.this, "Correct Answer!", Toast.LENGTH_SHORT).show();

                        questions.setText("What spell did Harry use to kill Lord Voldemort?");
                        clear();
                        answer.setHint("1 word, 12 letters");

                    }

                    else{
                        Toast.makeText(Quest4.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                    }
                }

                if(QueCount == 2){
                    if(answer.getText().toString().trim().equalsIgnoreCase("Expelliarmus")){
                        QueCount++;
                        Toast.makeText(Quest4.this, "Correct Answer!", Toast.LENGTH_SHORT).show();

                        questions.setText("Which Patronus belongs to Luna Lovegood?");
                        clear();
                        answer.setHint("1 words, 6 letters");

                    }

                    else{
                        Toast.makeText(Quest4.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                    }
                }

                if(QueCount == 3){
                    if(answer.getText().toString().trim().equalsIgnoreCase("Rabbit")){
                        QueCount++;
                        Toast.makeText(Quest4.this, "Correct Answer!", Toast.LENGTH_SHORT).show();

                        questions.setText("What was the name of the snake in chambers of secrets?");
                        clear();
                        answer.setHint("1 words, 8 letters");
                    }

                    else{
                        Toast.makeText(Quest4.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                    }

                }

                if(QueCount == 4){
                    if(answer.getText().toString().trim().equalsIgnoreCase("Basilisk")){
                        QueCount++;
                        Toast.makeText(Quest4.this, "Correct Answer!", Toast.LENGTH_SHORT).show();

                        questions.setText("The ‘Felifors’ spell turns a cat into a what?");
                        clear();
                        answer.setHint("1 words, 8 letters");
                    }

                    else{
                        Toast.makeText(Quest4.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                    }
                }

                if(QueCount == 5){
                    if(answer.getText().toString().trim().equalsIgnoreCase("Cauldron")){
                        QueCount++;
                        Toast.makeText(Quest4.this, "Correct Answer!", Toast.LENGTH_SHORT).show();

                        startActivity(new Intent(Quest4.this, End_Screen.class));
                        finish();
                    }

                    else{
                        Toast.makeText(Quest4.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }

    void clear(){
        answer.setText("");
    }
}