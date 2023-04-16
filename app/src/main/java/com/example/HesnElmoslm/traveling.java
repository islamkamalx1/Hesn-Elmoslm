package com.example.HesnElmoslm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class traveling extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traveling);

        Button safar_go = findViewById(R.id.safar_go);
        Button safar_back = findViewById(R.id.safar_back);
        Button tahween = findViewById(R.id.tahween);
        Button twakol = findViewById(R.id.twakol);

        safar_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent safar_go = new Intent(getApplicationContext(), com.example.HesnElmoslm.safar_go.class);
                startActivity(safar_go);
                finish();
            }
        });
        safar_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent safar_back = new Intent(getApplicationContext(), safar_back.class);
                startActivity(safar_back);
                finish();
            }
        });
        tahween.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tahween = new Intent(getApplicationContext(), tahween.class);
                startActivity(tahween);
                finish();
            }
        });
        twakol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent twakol = new Intent(getApplicationContext(), twakol.class);
                startActivity(twakol);
                finish();
            }
        });

    }
}