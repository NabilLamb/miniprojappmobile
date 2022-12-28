package com.example.miniprojappmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Info_utilisateur extends AppCompatActivity {
TextView t;
double BMR,l,p,a;
String sBMR;
Button b,bb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_utilisateur);

        t = (TextView) findViewById(R.id.idI);
        b = (Button) findViewById(R.id.suivant1);
        bb = (Button) findViewById(R.id.back2);

        Bundle b = getIntent().getExtras();

        p = Integer.parseInt(b.getString("poids"));
        l = Integer.parseInt(b.getString("longueur"));
        a = Integer.parseInt(b.getString("age"));


        BMR = 66*(13.7*p)+(5*l)-(6.8*a);

        sBMR = String.valueOf(BMR);


        t.setText(b.getString("prenom") + " , Pour connaitre la quantite de calories que " +
                "vous devriez manger par jour selon votre corps, nous nous sommes appuyes sur l'equation (BMR)," +
                " et le resultat est : "+sBMR+" que vous devez manger par jour.");

    }


    public void goPage (View view){
        Intent i = new Intent(Info_utilisateur.this,Taille.class);
        startActivity(i);
    }

    public void back2 (View view){
        Intent i = new Intent(Info_utilisateur.this,Informations.class);
        startActivity(i);
    }

}