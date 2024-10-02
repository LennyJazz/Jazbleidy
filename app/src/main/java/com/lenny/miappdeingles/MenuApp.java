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

public class MenuApp extends AppCompatActivity {

    Button btnColores, btnAnimales, btnfrutas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu_app);

        btnColores = findViewById(R.id.btnColores);
        btnAnimales = findViewById(R.id.btnAnimales);
        btnfrutas = findViewById(R.id.btnFrutas);

        // activar el clic en el boton

        btnColores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ircolores=new Intent(MenuApp.this,Colores.class);
                        startActivity(ircolores);
            }


        });

        btnAnimales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iranimales=new Intent(MenuApp.this, ActivityAnimales.class);
                startActivity(iranimales);

            }
        });

btnfrutas.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent irfrutas=new Intent(MenuApp.this,ActivityFrutas.class);
        startActivity(irfrutas);
    }
});

    }
}