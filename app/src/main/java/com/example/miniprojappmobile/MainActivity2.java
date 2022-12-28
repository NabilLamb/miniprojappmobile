package com.example.miniprojappmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {
ImageButton i1 ,i2;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        i1 = (ImageButton) findViewById(R.id.homme);
        i2 = (ImageButton) findViewById(R.id.femme);
        b = (Button) findViewById(R.id.back1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
    public void Hommefemme(View view) {
        Intent i = new Intent(MainActivity2.this,Informations.class);
        startActivity(i);
    }
}