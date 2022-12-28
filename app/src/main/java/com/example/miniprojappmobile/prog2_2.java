package com.example.miniprojappmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class prog2_2 extends AppCompatActivity {
Button b,bb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog22);
        b = (Button) findViewById(R.id.back22);
        bb = (Button) findViewById(R.id.next22);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(prog2_2.this,prog2_1.class);
                startActivity(i);
            }
        });
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(prog2_2.this,prog2_3.class);
                startActivity(i);
            }
        });
    }
}