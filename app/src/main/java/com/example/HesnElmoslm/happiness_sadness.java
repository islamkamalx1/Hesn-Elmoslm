package com.example.HesnElmoslm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class happiness_sadness extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happiness_sadness);

        Button khoof = findViewById(R.id.khoof);
        Button wswas = findViewById(R.id.wswas);
        Button happiness = findViewById(R.id.happiness);
        Button rezk = findViewById(R.id.rezk);

        khoof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent khoof = new Intent(getApplicationContext(), com.example.HesnElmoslm.khoof.class);
                startActivity(khoof);
                finish();
            }
        });
        wswas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wswas = new Intent(getApplicationContext(), wswas.class);
                startActivity(wswas);
                finish();
            }
        });
        happiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent happiness = new Intent(getApplicationContext(), happiness.class);
                startActivity(happiness);
                finish();
            }
        });
        rezk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rezk = new Intent(getApplicationContext(), rezk.class);
                startActivity(rezk);
                finish();
            }
        });


    }
}