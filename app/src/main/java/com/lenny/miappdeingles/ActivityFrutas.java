package com.lenny.miappdeingles;

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

public class ActivityFrutas extends AppCompatActivity {

    TextView textMzn, textFre, textPap;
    ImageView imgMzn, imgFre, imgPap;
    MediaPlayer sonidoMzn, sonidoFre, sonidoPap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_frutas);

        textMzn= findViewById(R.id.textAple);
        textFre = findViewById(R.id.textStrawberry);
        textPap = findViewById(R.id.textPapaya);

        imgMzn = findViewById(R.id.imageManzana);
        imgFre = findViewById(R.id.imageStrawberry);
        imgPap = findViewById(R.id.imagePapaya);

        sonidoMzn = MediaPlayer.create(this,R.raw.apple);
        sonidoFre =  MediaPlayer.create(this,R.raw.fresa);
        sonidoPap =  MediaPlayer.create(this,R.raw.papaya);


        imgMzn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMzn.setText("apple");
                sonidoMzn.start();
            }
        });

        imgFre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textFre.setText("stranwberry");
                sonidoFre.start();
            }

        });

        imgPap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPap.setText("papaya");
                sonidoPap.start();
            }

        });


    }
}