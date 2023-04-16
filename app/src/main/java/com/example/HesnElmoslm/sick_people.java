package com.example.HesnElmoslm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sick_people extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sick_people);

        Button balaa = findViewById(R.id.raf3_elblaa);
        Button karb = findViewById(R.id.elkarb);
        Button wkaya = findViewById(R.id.wkaya);
        Button shfaa = findViewById(R.id.shfaa);

        balaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blaa = new Intent(getApplicationContext(), com.example.HesnElmoslm.balaa.class);
                startActivity(blaa);
                finish();
            }
        });
        karb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karb = new Intent(getApplicationContext(), karb.class);
                startActivity(karb);
                finish();
            }
        });
        wkaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wkaya = new Intent(getApplicationContext(), wkaya.class);
                startActivity(wkaya);
                finish();
            }
        });
        shfaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shfaa = new Intent(getApplicationContext(), shfaa.class);
                startActivity(shfaa);
                finish();
            }
        });
    }
}