package com.lenny.miappdeingles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuAprenderJugar extends AppCompatActivity {
     Button btnAprender, btnJugar, btnAsignaturas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu_aprender_jugar);

        btnAprender = findViewById(R.id.btnAprender);
        btnJugar = findViewById(R.id.btnJugar);
        btnAsignaturas = findViewById(R.id.btnAsig);

     btnAprender.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent irAprender=new Intent(MenuAprenderJugar.this,MenuApp.class);
             startActivity(irAprender);
         }
     });

     btnJugar.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent irPreguntaAnimal1 = new Intent(MenuAprenderJugar.this, PreguntasAnimales1.class);
             startActivity(irPreguntaAnimal1);

         }
     });
        btnAsignaturas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irAppMaterias = new Intent(MenuAprenderJugar.this, AppMaterias.class);
                startActivity(irAppMaterias);

            }
        });



    }
}