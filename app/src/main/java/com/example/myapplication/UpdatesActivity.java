package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class UpdatesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_updates);

        ImageView chainsaw = findViewById(R.id.chainsaw);
        ((android.view.View) chainsaw).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UpdatesActivity.this, ChainsawmanActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout iconhome = findViewById(R.id.iconhome);
        iconhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UpdatesActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout iconhotnews = findViewById(R.id.iconhotnews);
        iconhotnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UpdatesActivity.this, HotnewsActivity.class);
                startActivity(intent);
            }
        });
        ImageView hunter = findViewById(R.id.hunter);
        ((android.view.View) hunter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UpdatesActivity.this, HunterxhunterActivity.class);
                startActivity(intent);
            }
        });
        ImageView jujutsukaisen = findViewById(R.id.jujutsu);
        ((android.view.View) jujutsukaisen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UpdatesActivity.this, JujutsukaisenActivity.class);
                startActivity(intent);
            }
        });
        ImageView Onepuchman = findViewById(R.id.onepuchman);
        ((android.view.View) Onepuchman).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UpdatesActivity.this, OnepuchmanActivity.class);
                startActivity(intent);
            }
        });
        ImageView zoom = findViewById(R.id.zoom100);
        ((android.view.View) zoom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UpdatesActivity.this, Zoom100Activity.class);
                startActivity(intent);
            }
        });
        ImageView bleach = findViewById(R.id.bleach);
        ((android.view.View) bleach).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UpdatesActivity.this, BleachActivity.class);
                startActivity(intent);
            }
        });
        ImageView boruto = findViewById(R.id.boruto);
        ((android.view.View) boruto).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UpdatesActivity.this, BorutoActivity.class);
                startActivity(intent);
            }
        });
        ImageView haikyu = findViewById(R.id.haikyu);
        ((android.view.View) haikyu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UpdatesActivity.this, HaikyuActivity.class);
                startActivity(intent);
            }
        });
        ImageView spyxfamily = findViewById(R.id.spyxfamily);
        ((android.view.View) spyxfamily).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UpdatesActivity.this, SpyxfamilyActivity.class);
                startActivity(intent);
            }
        });
        ImageView myhero = findViewById(R.id.myhero);
        ((android.view.View) myhero).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UpdatesActivity.this, MyheroacademiaActivity.class);
                startActivity(intent);
            }
        });
        ImageView tokrev = findViewById(R.id.tokrev);
        ((android.view.View) tokrev).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UpdatesActivity.this, TokyorevengerActivity.class);
                startActivity(intent);
            }
        });
        ImageView onepiece = findViewById(R.id.onepiece);
        ((android.view.View) onepiece).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UpdatesActivity.this, OnepieceActivity.class);
                startActivity(intent);
            }
        });
    }
}