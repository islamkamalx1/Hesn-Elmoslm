package com.example.HesnElmoslm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class welcom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);
        ImageView welcome=findViewById(R.id.welcome);
        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(4000);
                    Intent mainActivity = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(mainActivity);
                    finish();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        thread.start();
    }
}