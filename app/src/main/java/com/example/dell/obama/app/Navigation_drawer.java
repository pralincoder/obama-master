package com.example.dell.obama.app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.dell.obama.R;
import com.example.dell.obama.adapter.CardsAdapter;
import com.example.dell.obama.adapter.Myrecycler_Adapter;
import com.example.dell.obama.model.Newsdata_mode;

import java.util.ArrayList;

public class Navigation_drawer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    public ViewGroup newsnnotification;
    private Boolean ispanel;
    Myrecycler_Adapter adapter;
    LinearLayout linear_news;
    LinearLayout linear_connect;
    private Animation animationUp;
    private Animation animationDown;
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


    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
        LinearLayout linearconnect=(LinearLayout)findViewById(R.id.linear_connect);
        linearconnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Navigation_drawer.this,Connect_with_me.class);
                startActivity(intent);
            }
        });
        ImageView imageView=(ImageView)findViewById(R.id.image_menu);
        DrawableCompat.setTint(imageView.getDrawable(), ContextCompat.getColor(this,R.color.colorPrimary));
        ImageView imageview3=(ImageView)findViewById(R.id.setting);
        DrawableCompat.setTint(imageview3.getDrawable(), ContextCompat.getColor(this,R.color.colorPrimary));
        linear_news=(LinearLayout)findViewById(R.id.linear_news);
        linear_connect=(LinearLayout)findViewById(R.id.linear_connect);
        animationUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
        animationDown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);
        linear_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(linear_news.isShown()){
                    linear_news.setVisibility(View.GONE);
                    linear_news.startAnimation(animationUp);
                }
                else{
                    linear_news.setVisibility(View.VISIBLE);
                    linear_news.startAnimation(animationDown);
                }
            }

        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CardsAdapter adapter = new CardsAdapter(this);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);
        navigationView.setItemTextColor(ColorStateList.valueOf(getResources().getColor(R.color.colorPrimary)));


        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.news_n_notification);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Navigation_drawer.this, News_and_notification.class);
                startActivity(intent);
            }
        });
        intit();


        //  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
        //  @Override
        //public void onClick(View view) {
        //  Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        //        .setAction("Action", null).show();
        //}
        //});

        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        View header = navigationView.getHeaderView(0);
        ImageView imageView1 = (ImageView) header.findViewById(R.id.nav_close);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.closeDrawer(Gravity.START);
            }
        });
        imageView = (ImageView) findViewById(R.id.image_menu);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.openDrawer(Gravity.LEFT);
            }
        });
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


    }

    private void intit() {
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.list_of_news);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        LinearLayoutManager layoutManager1
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);





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


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.bio) {
            Intent intent2 = new Intent(Navigation_drawer.this, MyBio.class);
            startActivity(intent2);

            // Handle the camera action
        } else if (id == R.id.question) {
            Intent intent = new Intent(Navigation_drawer.this, QuestionAnswerActivity.class);
            startActivity(intent);

        } else if (id == R.id.notification) {
            Intent intent = new Intent(Navigation_drawer.this, Notification_activity.class);
            startActivity(intent);

        } else if (id == R.id.news) {
            Intent intent = new Intent(Navigation_drawer.this, News_and_notification.class);
            startActivity(intent);
        } else if (id == R.id.maps) {
            Intent intent = new Intent(Navigation_drawer.this, MapsActivity.class);
            startActivity(intent);

        } else if (id == R.id.gallery) {
            Intent intent = new Intent(Navigation_drawer.this,
                    GalleryActivity.class);
            startActivity(intent);

        } else if (id == R.id.social_media) {
            Intent intent1 = new Intent(Navigation_drawer.this, SocialMedia.class);
            startActivity(intent1);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
