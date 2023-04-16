package com.example.HesnElmoslm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Elheeg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elheeg);


        Button roayat_elqaaba = findViewById(R.id.roayat_elqaaba);
        Button hagar_aswd = findViewById(R.id.hagar_aswd);
        Button twaf = findViewById(R.id.twaf);
        Button safa_marwa = findViewById(R.id.safa_marwa);
        Button arafat = findViewById(R.id.arafat);

        roayat_elqaaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent roayat_elqaaba = new Intent(getApplicationContext(), com.example.HesnElmoslm.roayat_elqaaba.class);
                startActivity(roayat_elqaaba);
                finish();
            }
        });
        hagar_aswd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hagar_aswd = new Intent(getApplicationContext(), elhagar_elaswd.class);
                startActivity(hagar_aswd);
                finish();
            }
        });
        twaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent twaf = new Intent(getApplicationContext(), eltwaf.class);
                startActivity(twaf);
                finish();
            }
        });
        safa_marwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent safa_marwa = new Intent(getApplicationContext(), safa_marwa.class);
                startActivity(safa_marwa);
                finish();
            }
        });
        arafat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent arafat = new Intent(getApplicationContext(), arafat.class);
                startActivity(arafat);
                finish();
            }
        });
    }
}