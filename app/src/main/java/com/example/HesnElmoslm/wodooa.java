package com.example.HesnElmoslm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class wodooa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wodooa);

        Button before_wodooa = findViewById(R.id.before_wodooa);
        Button after_wodooa = findViewById(R.id.after_wodooa);
        Button zhaab_betAllah = findViewById(R.id.zhaab_betAllah);
        Button d5ol_betAllah = findViewById(R.id.d5ol_betAllah);

        before_wodooa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent before_wodooa = new Intent(getApplicationContext(), com.example.HesnElmoslm.before_wodooa.class);
                startActivity(before_wodooa);
                finish();
            }
        });
        after_wodooa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent after_wodooa = new Intent(getApplicationContext(), after_wodooa.class);
                startActivity(after_wodooa);
                finish();
            }
        });
        zhaab_betAllah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent zhaab_betAllah = new Intent(getApplicationContext(), zhaab_betAlla.class);
                startActivity(zhaab_betAllah);
                finish();
            }
        });
        d5ol_betAllah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d5ol_betAllah = new Intent(getApplicationContext(), d5ol_betAllah.class);
                startActivity(d5ol_betAllah);
                finish();
            }
        });

    }
}