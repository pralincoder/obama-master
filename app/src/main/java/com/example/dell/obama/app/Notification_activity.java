package com.example.dell.obama.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.obama.R;
import com.github.rpradal.lettrine.LettrineTextView;

public class Notification_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_activity);
        LettrineTextView letterineTextView = (LettrineTextView) findViewById(R.id.letterine);
        letterineTextView.setBodyText(getString(R.string.notification2));
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final TextView textView=(TextView)findViewById(R.id.notification1);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
       ImageView backBUttonImageView=(ImageView)findViewById(R.id.backButtonImageView);
       backBUttonImageView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               onBackPressed();
           }
       });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

