package com.lenny.miappdeingles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AppMaterias extends AppCompatActivity {

    Button btnIngles, btnMate, btnEspañol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_app_materias);

        btnIngles = findViewById(R.id.btnInglés);
        btnMate = findViewById(R.id.btnMate);
        btnEspañol = findViewById(R.id.btnEspañol);


        btnIngles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irIngles=new Intent(AppMaterias.this,MenuApp.class);
                startActivity(irIngles);
            }


        });

        btnMate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irMate = new Intent(AppMaterias.this,Calculadora.class);
                startActivity(irMate);
            }
        });

        btnEspañol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irEspañol = new Intent(AppMaterias.this,Vocales.class);
                startActivity(irEspañol);

            }
        });

    }
}