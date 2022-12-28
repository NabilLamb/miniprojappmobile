package com.example.miniprojappmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText username,password;
Button signin, b;
Data data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signin = (Button) findViewById(R.id.connexion);
        b = (Button) findViewById(R.id.CreeCompte);
        username = (EditText) findViewById(R.id.login11);
        password = (EditText) findViewById(R.id.pass11);
        data = new Data(this);


        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                if (TextUtils.isEmpty(user) || TextUtils.isEmpty(pass))
                    Toast.makeText(MainActivity.this,"Entrer le nom d'utilisateur et le mot de pass",Toast.LENGTH_SHORT).show();
                else
                {
                    Boolean checkuserpass = data.checkusernamepassword(user,pass);
                    if (checkuserpass==true)
                    {
                        Toast.makeText(MainActivity.this,"Connexion reussie",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Echec de connecxion",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),CreeCompte.class);
                startActivity(i);
            }
        });
    }
}