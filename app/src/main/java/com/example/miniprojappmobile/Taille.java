package com.example.miniprojappmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Taille extends AppCompatActivity {
Button p,m,g,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taille);

        p = (Button) findViewById(R.id.p);
        m = (Button) findViewById(R.id.m);
        g = (Button) findViewById(R.id.g);
        b = (Button) findViewById(R.id.back4);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Taille.this,Info_utilisateur.class);
                startActivity(i);
            }
        });
    }

    public void GoPage(View view) {
        Intent i = new Intent(Taille.this,Choix_programme.class);
        startActivity(i);
    }
}