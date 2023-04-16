package com.example.HesnElmoslm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img_morning = findViewById(R.id.imageMorning);
        Button btn_morning = findViewById(R.id.morningBtn);

        ImageView img_wodooa = findViewById(R.id.wodooaImage);
        Button btn_wodooa = findViewById(R.id.wodooaBtn);

        ImageView img_heg = findViewById(R.id.elhegImage);
        Button btn_heg = findViewById(R.id.elhegBtn);

        ImageView img_happy = findViewById(R.id.happyImage);
        Button btn_happy = findViewById(R.id.happyBtn);

        ImageView img_travel = findViewById(R.id.travelImg);
        Button btn_travel = findViewById(R.id.travelBtn);

        ImageView img_food = findViewById(R.id.foodImage);
        Button btn_food = findViewById(R.id.foodBtn);

        ImageView img_sick = findViewById(R.id.illnessImage);
        Button btn_sick = findViewById(R.id.illnessBtn);

        ImageView img_eladab = findViewById(R.id.eladabImage);
        Button btn_eladab = findViewById(R.id.eladabBtn);

        ImageView img_edu = findViewById(R.id.eduImage);
        Button btn_edu = findViewById(R.id.eduBtn);

        ImageView img_sehr = findViewById(R.id.sehrImage);
        Button btn_sehr = findViewById(R.id.sehrBtn);

        img_morning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent morning = new Intent(getApplicationContext(), morning.class);
                startActivity(morning);
            }
        });
        btn_morning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent morning = new Intent(getApplicationContext(), morning.class);
                startActivity(morning);
            }
        });

        img_wodooa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent img_wodooa = new Intent(getApplicationContext(), wodooa.class);
                startActivity(img_wodooa);
            }
        });
        btn_wodooa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_wodooa = new Intent(getApplicationContext(), wodooa.class);
                startActivity(btn_wodooa);
            }
        });

        img_heg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent heg = new Intent(getApplicationContext(), Elheeg.class);
                startActivity(heg);
            }
        });
        btn_heg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent heg = new Intent(getApplicationContext(), Elheeg.class);
                startActivity(heg);
            }
        });

        img_sehr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sehr = new Intent(getApplicationContext(), sehr.class);
                startActivity(sehr);
            }
        });
        btn_sehr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sehr = new Intent(getApplicationContext(), sehr.class);
                startActivity(sehr);
            }
        });

        img_happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent happySadness = new Intent(getApplicationContext(), happiness_sadness.class);
                startActivity(happySadness);
            }
        });
        btn_happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent happySadness = new Intent(getApplicationContext(), happiness_sadness.class);
                startActivity(happySadness);
            }
        });

        img_travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent travel = new Intent(getApplicationContext(), traveling.class);
                startActivity(travel);
            }
        });
        btn_travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent travel = new Intent(getApplicationContext(), traveling.class);
                startActivity(travel);
            }
        });

        img_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent food = new Intent(getApplicationContext(), food_drink.class);
                startActivity(food);
            }
        });
        btn_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent food = new Intent(getApplicationContext(), food_drink.class);
                startActivity(food);
            }
        });

        img_sick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sick = new Intent(getApplicationContext(), sick_people.class);
                startActivity(sick);
            }
        });
        btn_sick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sick = new Intent(getApplicationContext(), sick_people.class);
                startActivity(sick);
            }
        });

        img_eladab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eladab = new Intent(getApplicationContext(), com.example.HesnElmoslm.eladab.class);
                startActivity(eladab);
            }
        });
        btn_eladab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eladab = new Intent(getApplicationContext(), com.example.HesnElmoslm.eladab.class);
                startActivity(eladab);
            }
        });

        img_edu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent edu = new Intent(getApplicationContext(), book.class);
                startActivity(edu);
            }
        });
        btn_edu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent edu = new Intent(getApplicationContext(), book.class);
                startActivity(edu);
            }
        });
    }
}