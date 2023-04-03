package com.example.androidartist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Quest3 extends AppCompatActivity {
    EditText ans;
    Button Submit;
    ImageView img;
    int QueCount = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest3);

        ans = findViewById(R.id.ans3);

        img = findViewById(R.id.imageView3);

        Submit  = findViewById(R.id.submit3);

        img.setImageResource(R.drawable.elder_wand);
        ans.setHint("2 Words, 5 letters and 4 letters");

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(QueCount == 1){
                    if((ans.getText().toString().trim().equalsIgnoreCase("Elder Wand"))){
                        QueCount++;
                        Toast.makeText(Quest3.this, "Correct Answer!", Toast.LENGTH_SHORT).show();
                        img.setImageResource(R.drawable.scabbers);

                        //NEED TO EMPTY EDIT TEXTS!!!
                        clear();
                        ans.setHint("1 Words, 8 letters");

                    }

                    else{
                        Toast.makeText(Quest3.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                    }

                }
                else if(QueCount == 2){
                    //Yet to be made
                    if(ans.getText().toString().trim().equalsIgnoreCase("Scabbers")){
                        QueCount++;
                        Toast.makeText(Quest3.this, "Correct Answer!", Toast.LENGTH_SHORT).show();
                        img.setImageResource(R.drawable.ravenclaw);

                        clear();
                        ans.setHint("1 Word, 9 letters");

                    }
                }

                else if(QueCount == 3){
                    if(ans.getText().toString().trim().equalsIgnoreCase("Ravenclaw")){
                        //Intent
                        Toast.makeText(Quest3.this, "Correct Answer!", Toast.LENGTH_SHORT).show();

                        startActivity(new Intent(Quest3.this, End_Screen.class));
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