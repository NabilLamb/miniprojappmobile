package com.example.miniprojappmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Choix_programme extends AppCompatActivity {
Button b1,b2,b3, h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_programme);
        b1 = (Button) findViewById(R.id.p1);
        b2 = (Button) findViewById(R.id.p2);
        b3 = (Button) findViewById(R.id.p3);
        h = (Button) findViewById(R.id.home);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Choix_programme.this,prog1_1.class);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Choix_programme.this,prog2_1.class);
                startActivity(i);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Choix_programme.this,prog3_1.class);
                startActivity(i);
            }
        });

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Choix_programme.this,MainActivity2.class);
                startActivity(i);
            }
        });
    }
}