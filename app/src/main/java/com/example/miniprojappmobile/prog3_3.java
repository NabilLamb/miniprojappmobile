package com.example.miniprojappmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class prog3_3 extends AppCompatActivity {
Button b,bb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog33);

        b = (Button) findViewById(R.id.back33);
        bb = (Button) findViewById(R.id.next33);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(prog3_3.this,prog3_2.class);
                startActivity(i);
            }
        });
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(prog3_3.this,Filisitation.class);
                startActivity(i);
            }
        });
    }
}