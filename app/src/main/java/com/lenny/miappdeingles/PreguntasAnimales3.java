package com.lenny.miappdeingles;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PreguntasAnimales3 extends AppCompatActivity {

    Button btnSiguien;
    ImageView imgSerpiente, imgPerro, imgCaballo, imgTortuga;
    MediaPlayer sonidoSerpiente, sonidoPerro, sonidoCaballo, sonidoTortuga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_preguntas_animales3);

        btnSiguien = findViewById(R.id.btnSiguienteTres);

        imgSerpiente = findViewById(R.id.ImgSerpi);
        imgPerro = findViewById(R.id.ImgPerr);
        imgCaballo = findViewById(R.id.ImgCaball3);
        imgTortuga = findViewById(R.id.ImgTortu);

        sonidoSerpiente = MediaPlayer.create(this, R.raw.incorecto);
        sonidoPerro = MediaPlayer.create(this, R.raw.incorecto);
        sonidoCaballo = MediaPlayer.create(this, R.raw.incorecto);
        sonidoTortuga = MediaPlayer.create(this, R.raw.exelente);

        btnSiguien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irSiguiente = new Intent(PreguntasAnimales3.this,PreguntasColores1.class);
                startActivity(irSiguiente);
            }
        });

        imgSerpiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidoSerpiente.start();
            }
        });

        imgPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidoPerro.start();
            }
        });

        imgCaballo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidoCaballo.start();
            }
        });

        imgTortuga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidoTortuga.start();
            }
        });



    }
}