package com.example.HesnElmoslm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class morning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning);

        Button sabah_masaaBtn = findViewById(R.id.sabah_masaa);
        Button waking_up = findViewById(R.id.waking_up);
        Button azkar_elnoom = findViewById(R.id.noom);
        Button dreaming = findViewById(R.id.dreaming);
        Button moving = findViewById(R.id.moving);

        sabah_masaaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sabah_masaa = new Intent(getApplicationContext(), sabahWEmasaa.class);
                startActivity(sabah_masaa);
                finish();
            }
        });
        waking_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent waking_up = new Intent(getApplicationContext(), waking_up.class);
                startActivity(waking_up);
                finish();
            }
        });
        azkar_elnoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent azkar_elnoom = new Intent(getApplicationContext(), azkarelnoom.class);
                startActivity(azkar_elnoom);
                finish();
            }
        });
        dreaming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dreaming = new Intent(getApplicationContext(), dreaming.class);
                startActivity(dreaming);
                finish();
            }
        });
        moving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moving = new Intent(getApplicationContext(), moving_night.class);
                startActivity(moving);
                finish();
            }
        });

    }
}