package com.lenny.miappdeingles;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PreguntasAnimales1 extends AppCompatActivity {

    Button btnSiguien;
    TextView textSerp, textPerro, textCaball, textTortuga;
    ImageView ImgSerp, ImgPerro, ImgCaball, ImgTortuga;
    MediaPlayer sonidoSnake, sonidoDog, sonidoHorse, sonidoTortu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_preguntas_animales1);

        btnSiguien = findViewById(R.id.btnSiguiente);

        ImgSerp = findViewById(R.id.ImgSerpiente);
        ImgPerro = findViewById(R.id.imagedog);
        ImgCaball = findViewById(R.id.imageHorse);
        ImgTortuga = findViewById(R.id.imageTortuga);


        sonidoSnake = MediaPlayer.create(this,R.raw.incorecto);
        sonidoDog =  MediaPlayer.create(this,R.raw.exelente);
        sonidoHorse =  MediaPlayer.create(this,R.raw.incorecto);
        sonidoTortu =  MediaPlayer.create(this,R.raw.incorecto);

        ImgSerp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sonidoSnake.start();
            }
        });

        ImgPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sonidoDog.start();
            }

        });

        ImgCaball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sonidoHorse.start();
            }

        });
        ImgTortuga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sonidoTortu.start();
            }

        });

        btnSiguien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irSiguiente = new Intent(PreguntasAnimales1.this,PreguntasAnimales2.class);
                 startActivity(irSiguiente);
            }
        });


    }
}