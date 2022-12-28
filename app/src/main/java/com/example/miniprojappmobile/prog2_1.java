package com.example.miniprojappmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class prog2_1 extends AppCompatActivity {
Button b,bb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog21);

        b = (Button) findViewById(R.id.back21);
        bb = (Button) findViewById(R.id.next21);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(prog2_1.this,Choix_programme.class);
                startActivity(i);
            }
        });
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(prog2_1.this,prog2_2.class);
                startActivity(i);
            }
        });
    }
}