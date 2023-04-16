package com.example.HesnElmoslm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class food_drink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_drink);

        Button start_food = findViewById(R.id.start_food);
        Button end_food = findViewById(R.id.end_food);
        Button save_food = findViewById(R.id.save_food);
        Button thank_food = findViewById(R.id.thank_food);

        start_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent start_food = new Intent(getApplicationContext(), com.example.HesnElmoslm.start_food.class);
                startActivity(start_food);
                finish();
            }
        });
        end_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent end_food = new Intent(getApplicationContext(), end_food.class);
                startActivity(end_food);
                finish();
            }
        });
        save_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent save_food = new Intent(getApplicationContext(), save_food.class);
                startActivity(save_food);
                finish();
            }
        });
        thank_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thank_food = new Intent(getApplicationContext(), thank_food.class);
                startActivity(thank_food);
                finish();
            }
        });

    }
}