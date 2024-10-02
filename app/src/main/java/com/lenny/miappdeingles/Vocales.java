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

public class Vocales extends AppCompatActivity {
    Button btnSiguiente;
    ImageView imgA, imgE, imgI, imgO, imgU;
    MediaPlayer sonidoA, sonidoE, sonidoI, sonidoO, sonidoU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_vocales);

        btnSiguiente = findViewById(R.id.btnSiguienteVocal);



        imgA = findViewById(R.id.ImgA);
        imgE = findViewById(R.id.ImgE);
        imgI = findViewById(R.id.ImgI);
        imgO = findViewById(R.id.ImgO);
        imgU = findViewById(R.id.ImgU);


        sonidoA = MediaPlayer.create(this,R.raw.vocalaa);
        sonidoE =  MediaPlayer.create(this,R.raw.vocalee);
        sonidoI =  MediaPlayer.create(this,R.raw.vocalii);
        sonidoO =  MediaPlayer.create(this,R.raw.vocaloo);
        sonidoU =  MediaPlayer.create(this,R.raw.vocaluu);


        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irSiguiente = new Intent(Vocales.this, VideoVocal.class);
                startActivity(irSiguiente);
            }
        });


                imgA.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sonidoA.start();
                    }
                });

                imgE.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sonidoE.start();
                    }
                });


                imgI.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sonidoI.start();
                    }
                });

                imgO.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sonidoO.start();
                    }
                });

                imgU.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sonidoU.start();
                    }
                });

    }
}
