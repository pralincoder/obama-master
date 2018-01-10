package com.example.dell.obama.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.example.dell.obama.R;
import com.example.dell.obama.adapter.CardsAdapter;
import com.example.dell.obama.adapter.Myrecycler_Adapter;
import com.example.dell.obama.model.Newsdata_mode;
import com.example.dell.obama.model.Samasad_model;

import java.util.ArrayList;
import java.util.List;

public class News_and_notification extends AppCompatActivity {
    private List<Samasad_model> samasad_modelList = new ArrayList<>();
    private RecyclerView recyclerView;

    Myrecycler_Adapter adapter;
    private final String title[] = {
            "Thapa fights to retain repute",
            "Thapa fights to retain repute",
            "Thapa fights to retain repute",
            "Thapa fights to retain repute",
            "Thapa fights to retain repute",
            "Thapa fights to retain repute",
            "Thapa fights to retain repute",
            "Thapa fights to retain repute",
            "Thapa fights to retain repute",
            "Thapa fights to retain repute"
    };
    private final String date[]={
            "26 feb 2017",
            "26 feb 2017",
            "26 feb 2017",
            "26 feb 2017",
            "26 feb 2017",
            "26 feb 2017",
            "26 feb 2017",

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_and_notification);

        CardsAdapter adapter = new CardsAdapter(this);
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        

        prepareListdata();

        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
        ImageView backButonImageView=(ImageView)findViewById(R.id.backButtonImageView);
        backButonImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

intitviews();
    }

    private void intitviews() {
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recylerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        ArrayList gagannews = prepareData();
        Myrecycler_Adapter adapter = new Myrecycler_Adapter(getApplicationContext(),gagannews);
        recyclerView.setAdapter(adapter);

    }

    private ArrayList prepareData() {
        ArrayList gagannews = new ArrayList <>();
        for (int i = 0; i < title.length; i++) {
            Newsdata_mode newsdata_mode = new Newsdata_mode();
            newsdata_mode.setNews_title(title[i]);
            gagannews.add(newsdata_mode);
        }
        return gagannews;
    }

    private void prepareListdata() {


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
