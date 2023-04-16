package com.example.HesnElmoslm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sehr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sehr);

        Button tahseen_sehr = findViewById(R.id.tahseen_sehr);
        Button fak_sehr = findViewById(R.id.fak_sehr);
        Button hefz_sehr = findViewById(R.id.hefz_sehr);

        tahseen_sehr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tahseen_sehr = new Intent(getApplicationContext(), com.example.HesnElmoslm.tahseen_sehr.class);
                startActivity(tahseen_sehr);
                finish();
            }
        });
        fak_sehr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fak_sehr = new Intent(getApplicationContext(), fak_sehr.class);
                startActivity(fak_sehr);
                finish();
            }
        });
        hefz_sehr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hefz_sehr = new Intent(getApplicationContext(), hefz_sehr.class);
                startActivity(hefz_sehr);
                finish();
            }
        });

    }
}