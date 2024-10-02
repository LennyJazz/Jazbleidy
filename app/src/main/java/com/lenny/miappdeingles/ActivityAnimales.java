package com.lenny.miappdeingles;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityAnimales extends AppCompatActivity {
TextView textDog, textHors, textTort;
ImageView imgDog, imgHors, imgTort;
MediaPlayer sonidoDog, sonidoHors, sonidoTort;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_animales2);

        textDog = findViewById(R.id.textDog);
        textHors = findViewById(R.id.textHorse);
        textTort = findViewById(R.id.textTortoise);

        imgDog = findViewById(R.id.imagedog);
        imgHors = findViewById(R.id.imageHorse);
        imgTort = findViewById(R.id.imageTortoise);

        sonidoDog = MediaPlayer.create(this,R.raw.dog);
        sonidoHors =  MediaPlayer.create(this,R.raw.horse);
        sonidoTort =  MediaPlayer.create(this,R.raw.tortuga);



        imgDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textDog.setText("dog");
                sonidoDog.start();
            }
        });

        imgHors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textHors.setText("horse");
                sonidoHors.start();
            }

        });

        imgTort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textTort.setText("tortoise");
                sonidoTort.start();
            }
        });
    }

}