package com.example.dell.obama.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.dell.obama.R;
import com.example.dell.obama.adapter.CardsAdapter;
import com.example.dell.obama.model.Model;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView)findViewById(R.id.list_of_news);
        CardsAdapter adapter = new CardsAdapter(this);

        listView.setAdapter((ListAdapter) adapter);
        adapter.addAll(new Model(R.drawable.obama, R.string.obama, R.string.obama_sub),
                new Model(R.drawable.obama, R.string.obama, R.string.obama_sub),
                new Model(R.drawable.obama, R.string.obama, R.string.obama_sub));

        LinearLayout linearLayout=(LinearLayout)findViewById(R.id.news_n_notification);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,News_and_notification.class);
                startActivity(intent);
            }
        });

    }
}
