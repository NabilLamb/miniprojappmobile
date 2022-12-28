package com.example.miniprojappmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Filisitation extends AppCompatActivity {
Button b;
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filisitation);
            b=(Button) findViewById(R.id.pro);
    }

    public void BackPro(View view) {
        Intent i = new Intent(Filisitation.this,Choix_programme.class);
        startActivity(i);
    }
}