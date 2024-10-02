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

public class PreguntasColores3 extends AppCompatActivity {

    Button btnSiguien;
    ImageView imgRosa, imgNegro, imgPastel, imgBlanco;
    MediaPlayer sonidoRosa, sonidoNegro, sonidoPastel, sonidoBlanco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_preguntas_colores3);

        btnSiguien = findViewById(R.id.btnSiguiente);

        imgRosa = findViewById(R.id.ImgRosaTres);
        imgNegro = findViewById(R.id.ImgNegroTres);
        imgPastel = findViewById(R.id.ImgPastelTres);
        imgBlanco = findViewById(R.id.ImgBlancoTres);

        sonidoRosa = MediaPlayer.create( this,R.raw.incorecto);
        sonidoNegro = MediaPlayer.create(this,R.raw.incorecto);
        sonidoPastel = MediaPlayer.create(this,R.raw.incorecto);
        sonidoBlanco = MediaPlayer.create(this,R.raw.exelente);

        btnSiguien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irSiguiente = new Intent(PreguntasColores3.this,PreguntasFrutas1.class);
                startActivity(irSiguiente);
            }
        });

        imgRosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidoRosa.start();
            }
        });

        imgNegro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidoNegro.start();
            }
        });

        imgPastel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidoPastel.start();
            }
        });

        imgBlanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidoBlanco.start();
            }
        });

    }
}