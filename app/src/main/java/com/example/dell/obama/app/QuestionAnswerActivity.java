package com.example.dell.obama.app;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.dell.obama.R;

public class QuestionAnswerActivity extends AppCompatActivity {
    Button askQuestionButton;

    ImageView backBUtton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_answer);

        backBUtton=(ImageView)findViewById(R.id.backButtonImageView);
        backBUtton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        askQuestionButton=(Button)findViewById(R.id.askQUestionButton);
        askQuestionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuestionAnswerActivity.this,YourQuestionActivity.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
