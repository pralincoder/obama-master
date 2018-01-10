package com.example.dell.obama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.dell.obama.adapter.CardsAdapter;
import com.example.dell.obama.model.Model;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
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
