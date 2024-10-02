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

public class PreguntasFrutas2 extends AppCompatActivity {

    Button btnSiguien;
    ImageView imgCereza, imgFresa, imgSandia, imgPapaya;
    MediaPlayer sonidoCereza, sonidoFresa, sonidoSandia, sonidoPapaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_preguntas_frutas2);

        btnSiguien = findViewById(R.id.btnSiguienteFrutasDos);

        imgCereza = findViewById(R.id.ImgCerezaDos);
        imgFresa = findViewById(R.id.ImgFresaDos);
        imgSandia = findViewById(R.id.ImgSandiaDos);
        imgPapaya = findViewById(R.id.ImgPapayaDos);

        sonidoCereza = MediaPlayer.create(this,R.raw.incorecto);
        sonidoFresa = MediaPlayer.create(this,R.raw.incorecto);
        sonidoSandia = MediaPlayer.create(this,R.raw.incorecto);
        sonidoPapaya = MediaPlayer.create(this,R.raw.exelente);


        btnSiguien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irSiguiente = new Intent(PreguntasFrutas2.this,PreguntasFrutas3.class);
                startActivity(irSiguiente);
            }
        });

        imgCereza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidoCereza.start();
            }
        });

        imgFresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidoFresa.start();
            }
        });

        imgSandia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidoSandia.start();
            }
        });

        imgPapaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidoPapaya.start();
            }
        });


    }
}