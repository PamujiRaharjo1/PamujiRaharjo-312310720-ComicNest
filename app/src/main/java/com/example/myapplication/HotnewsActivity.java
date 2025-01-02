package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HotnewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hotnews);

        RelativeLayout chainsaw = findViewById(R.id.chainsaw);
        chainsaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotnewsActivity.this, ChainsawmanActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout iconhome = findViewById(R.id.iconhome);
        iconhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotnewsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout iconupdates = findViewById(R.id.iconupdates);
        iconupdates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotnewsActivity.this, UpdatesActivity.class);
                startActivity(intent);
            }
        });
        RelativeLayout demon = findViewById(R.id.demon);
        demon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotnewsActivity.this, DemonslayerActivity.class);
                startActivity(intent);
            }
        });
        RelativeLayout jujutsukaisen = findViewById(R.id.jujutsu);
        jujutsukaisen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotnewsActivity.this, JujutsukaisenActivity.class);
                startActivity(intent);
            }
        });
        RelativeLayout boruto = findViewById(R.id.boruto);
        boruto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotnewsActivity.this, BorutoActivity.class);
                startActivity(intent);
            }
        });
    }
}