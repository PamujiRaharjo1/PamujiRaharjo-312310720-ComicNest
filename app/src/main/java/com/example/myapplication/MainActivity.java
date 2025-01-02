package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView chainsaw = findViewById(R.id.chainsaw);
        ((android.view.View) chainsaw).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChainsawmanActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout layoutTrigger = findViewById(R.id.iconupdates);
        layoutTrigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UpdatesActivity.class);
                startActivity(intent);

            }
        });
        LinearLayout iconhotnews = findViewById(R.id.iconhotnews);
        iconhotnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HotnewsActivity.class);
                startActivity(intent);

            }
        });
        ImageView hunter = findViewById(R.id.hunter);
        ((android.view.View) hunter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HunterxhunterActivity.class);
                startActivity(intent);
            }
        });
        ImageView demon = findViewById(R.id.demon);
        ((android.view.View) demon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DemonslayerActivity.class);
                startActivity(intent);
            }
        });
        ImageView mashle = findViewById(R.id.mashle);
        ((android.view.View) mashle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MashleActivity.class);
                startActivity(intent);
            }
        });
        ImageView jujutsu = findViewById(R.id.jujutsu);
        ((android.view.View) jujutsu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JujutsukaisenActivity.class);
                startActivity(intent);
            }
        });
        ImageView jujutsu1 = findViewById(R.id.jujutsu1);
        ((android.view.View) jujutsu1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JujutsukaisenActivity.class);
                startActivity(intent);
            }
        });
        ImageView onepuchman = findViewById(R.id.onepuchman);
        ((android.view.View) onepuchman).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, OnepuchmanActivity.class);
                startActivity(intent);
            }
        });
        ImageView drstone = findViewById(R.id.drstone);
        ((android.view.View) drstone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DrstoneActivity.class);
                startActivity(intent);
            }
        });
        ImageView bleach= findViewById(R.id.bleach);
        ((android.view.View) bleach).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BleachActivity.class);
                startActivity(intent);
            }
        });
        ImageView zoom= findViewById(R.id.zoom100);
        ((android.view.View) zoom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Zoom100Activity.class);
                startActivity(intent);
            }
        });
        ImageView boruto= findViewById(R.id.boruto);
        ((android.view.View) boruto).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BorutoActivity.class);
                startActivity(intent);
            }
        });
        ImageView Kaiju= findViewById(R.id.kaiju);
        ((android.view.View) Kaiju).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KaijuActivity.class);
                startActivity(intent);
            }
        });
        ImageView Myhero= findViewById(R.id.myhero);
        ((android.view.View) Myhero).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyheroacademiaActivity.class);
                startActivity(intent);
            }
        });
    }
}

