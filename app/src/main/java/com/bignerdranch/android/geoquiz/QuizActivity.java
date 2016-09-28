package com.bignerdranch.android.geoquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private Button buttonTrue;
    private Button buttonFalse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        buttonTrue = (Button) findViewById(R.id.true_button);
        buttonFalse = (Button) findViewById(R.id.false_button);

        //setting the onClickListener for the true_button
        buttonTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(QuizActivity.this, "True-button pressed", Toast.LENGTH_SHORT).show();
            }
        });

        //setting the onClickListener for the false_button
        buttonFalse.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(QuizActivity.this, "False-button pressed", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
