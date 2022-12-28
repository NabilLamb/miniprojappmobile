package com.example.miniprojappmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Informations extends AppCompatActivity {
EditText e1, e2, e3, e4, e5;
Button b,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informations);

        e1 = (EditText) findViewById(R.id.nom);
        e2 = (EditText) findViewById(R.id.prenom);
        e3 = (EditText) findViewById(R.id.longueur);
        e4 = (EditText) findViewById(R.id.age);
        e5 = (EditText) findViewById(R.id.poids);
        b = (Button) findViewById(R.id.suivant);
        back = (Button) findViewById(R.id.back3);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Informations.this,Info_utilisateur.class);
                Bundle b = new Bundle();
                b.putString("nom",e1.getText().toString());
                b.putString("prenom",e2.getText().toString());
                b.putString("longueur",e3.getText().toString());
                b.putString("age",e4.getText().toString());
                b.putString("poids",e5.getText().toString());
                i.putExtras(b);
                startActivity(i);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Informations.this,MainActivity2.class);
                startActivity(i);
            }
        });
    }
}