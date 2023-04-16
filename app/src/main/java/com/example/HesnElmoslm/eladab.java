package com.example.HesnElmoslm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eladab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eladab);

        Button hosn_elkholoq = findViewById(R.id.hosn_kholoq);
        Button mkarm_elakhlaa = findViewById(R.id.mkarm_akhlaa);
        Button mahaba = findViewById(R.id.mahaba);
        Button shar_elnas = findViewById(R.id.shar_elnas);

        hosn_elkholoq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hosn_elkholoq = new Intent(getApplicationContext(), hosn_kholoq.class);
                startActivity(hosn_elkholoq);
                finish();
            }
        });
        mkarm_elakhlaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mkarm_elakhlaa = new Intent(getApplicationContext(), mkarm_akhlaa.class);
                startActivity(mkarm_elakhlaa);
                finish();
            }
        });
        mahaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mahaba = new Intent(getApplicationContext(), mahaba.class);
                startActivity(mahaba);
                finish();
            }
        });
        shar_elnas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shar_elnas = new Intent(getApplicationContext(), shar_elnas.class);
                startActivity(shar_elnas);
                finish();
            }
        });
    }
}