package com.example.dell.obama;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.dell.obama.adapter.CardsAdapter;
import com.example.dell.obama.model.Model;

public class DemoScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ListView listView = (ListView) findViewById(R.id.list_of_news);
        CardsAdapter adapter = new CardsAdapter(this);
        listView.setAdapter((ListAdapter) adapter);
        adapter.addAll(
                new Model(R.drawable.obama, R.string.obama, R.string.obama_sub),
                new Model(R.drawable.obama, R.string.obama, R.string.obama_sub),
                new Model(R.drawable.obama, R.string.obama, R.string.obama_sub),
                new Model(R.drawable.obama, R.string.obama, R.string.obama_sub),
                new Model(R.drawable.obama, R.string.obama, R.string.obama_sub),
                new Model(R.drawable.obama, R.string.obama, R.string.obama_sub),
                new Model(R.drawable.obama, R.string.obama, R.string.obama_sub)
        );

    }
}
