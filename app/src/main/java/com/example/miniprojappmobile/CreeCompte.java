package com.example.miniprojappmobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CreeCompte extends AppCompatActivity {
    EditText username, password,repassword;
    Data data;
    Button signup, signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cree_compte);
        data = new Data(this);
        username = (EditText) findViewById(R.id.loginn);
        password = (EditText) findViewById(R.id.passs);
        repassword = (EditText) findViewById(R.id.cmp);
        signup= (Button) findViewById(R.id.signup);
        signin = (Button) findViewById(R.id.signin);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=username.getText().toString();
                String pass=password.getText().toString();
                String repass=repassword.getText().toString();

                if (TextUtils.isEmpty(user) || TextUtils.isEmpty(pass) || TextUtils.isEmpty(repass))
                    Toast.makeText(CreeCompte.this,"Entrer tous les informations",Toast.LENGTH_SHORT).show();
                else
                {
                    if(pass.equals(repass))
                    {
                        Boolean checkuser = data.checkusername(user);
                        if (checkuser==false)
                        {
                            Boolean insert = data.insert_data(user,pass);
                            if (insert==true)
                            {
                                Toast.makeText(CreeCompte.this,"Votre compte a ete enregistre avec SUCCES",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                                startActivity(intent);
                            }
                            else
                            {
                                Toast.makeText(CreeCompte.this,"Echec de l'enregistrement",Toast.LENGTH_SHORT).show();
                            }
                        }
                        else
                        {
                            Toast.makeText(CreeCompte.this,"Utilisateur existe deja",Toast.LENGTH_SHORT).show();
                        }
                    }
                    else
                    {
                        Toast.makeText(CreeCompte.this,"Mot de Passe ne correspond pas",Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
