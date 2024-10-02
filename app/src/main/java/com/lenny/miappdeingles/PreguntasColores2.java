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

public class PreguntasColores2 extends AppCompatActivity {

    Button btnSiguien;
    ImageView imgRosa, imgNegro, imgPastel, imgBlanco;
    MediaPlayer sonidoRosa, sonidoNegro, sonidoPastel, sonidoBlanco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_preguntas_colores2);

        btnSiguien = findViewById(R.id.btnSiguienteColor);

        imgRosa = findViewById(R.id.ImgRosaDos);
        imgNegro = findViewById(R.id.ImgNegroDos);
        imgPastel = findViewById(R.id.ImgPastelDos);
        imgBlanco = findViewById(R.id.ImgBlancoDos);

        sonidoRosa = MediaPlayer.create(this, R.raw.incorecto);
        sonidoNegro = MediaPlayer.create(this, R.raw.exelente);
        sonidoPastel = MediaPlayer.create(this, R.raw.incorecto);
        sonidoBlanco = MediaPlayer.create(this, R.raw.incorecto);

        btnSiguien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irSiguiente = new Intent(PreguntasColores2.this,PreguntasColores3.class);
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