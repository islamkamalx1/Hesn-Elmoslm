package com.example.HesnElmoslm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class book extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        Button mozakra_start = findViewById(R.id.mozakra_start);
        Button talab_el3lm = findViewById(R.id.talab_el3lm);
        Button tasheel_mozakra = findViewById(R.id.tsheel_mozakra);
        Button tasbeet_el3lm = findViewById(R.id.tsbeet_el3lm);

        mozakra_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mozakra_start = new Intent(getApplicationContext(), com.example.HesnElmoslm.mozakra_start.class);
                startActivity(mozakra_start);
                finish();
            }
        });
        talab_el3lm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent talab_el3lm = new Intent(getApplicationContext(), talab_el3lm.class);
                startActivity(talab_el3lm);
                finish();
            }
        });
        tasheel_mozakra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tasheel_mozakra = new Intent(getApplicationContext(), tasheel_mozakra.class);
                startActivity(tasheel_mozakra);
                finish();
            }
        });
        tasbeet_el3lm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tasbeet_el3lm = new Intent(getApplicationContext(), tasbeet_el3lm.class);
                startActivity(tasbeet_el3lm);
                finish();
            }
        });

    }
}