package com.lenny.miappdeingles;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PreguntasFrutas1 extends AppCompatActivity {

    Button btnSiguien;
    ImageView imgCereza, imgFresa, imgSandia, imgPapaya;
    MediaPlayer sonidoCereza, sonidoFresa, sonidoSandia, sonidoPapaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_preguntas_frutas1);

        btnSiguien = findViewById(R.id.btnSiguienteFrutasUno);

        imgCereza = findViewById(R.id.ImgCerezaUno);
        imgFresa = findViewById(R.id.ImgFresaUno);
        imgSandia = findViewById(R.id.ImgSandiaUno);
        imgPapaya = findViewById(R.id.ImgPapayaUno);

        sonidoCereza = MediaPlayer.create( this,R.raw.exelente);
        sonidoFresa = MediaPlayer.create(this,R.raw.incorecto);
        sonidoSandia = MediaPlayer.create(this,R.raw.incorecto);
        sonidoPapaya = MediaPlayer.create(this,R.raw.incorecto);

        btnSiguien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irSiguiente = new Intent(PreguntasFrutas1.this,PreguntasFrutas2.class);
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