package com.example.dell.obama.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.obama.R;
import com.example.dell.obama.model.Newsdata_mode;

import java.util.ArrayList;

public class Myrecycler_Adapter extends RecyclerView.Adapter<Myrecycler_Adapter.ViewHolder> {
    private ArrayList<Newsdata_mode> gagannews;
    private Context context;

    public Myrecycler_Adapter(Context context, ArrayList<Newsdata_mode> gagannews) {
        this.context = context;
        this.gagannews = gagannews;

    }

    @Override
    public Myrecycler_Adapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.news, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {


        viewHolder.news_title.setText(gagannews.get(i).getNews_title());
        viewHolder.newsdate.setText(gagannews.get(i).getNewsdate());

    }

    @Override
    public int getItemCount() {
        return gagannews.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView news_title;
        TextView newsdate;
        ImageView img_android;
        public ViewHolder(View view) {
            super(view);

            news_title = (TextView)view.findViewById(R.id.news_title);
            newsdate=(TextView)view.findViewById(R.id.newsdate);
        }
    }
}