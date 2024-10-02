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

public class Colores extends AppCompatActivity {

    TextView textBlan, textRosa, textNegr;
    ImageView imgBlan, imgRosa, imgNegr;
    MediaPlayer sonidoWhite, sonidoPink, sonidoblack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_colores);

        textBlan = findViewById(R.id.textWhite);
        textNegr = findViewById(R.id.textBlack);
        textRosa = findViewById(R.id.textPink);

         imgBlan = findViewById(R.id.imageBlanco);
         imgNegr = findViewById(R.id.imageNegro);
         imgRosa = findViewById(R.id.imageRosado);

        sonidoWhite = MediaPlayer.create(this,R.raw.white);
        sonidoPink =  MediaPlayer.create(this,R.raw.pink);
        sonidoblack =  MediaPlayer.create(this,R.raw.black);


        imgBlan.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
               textBlan.setText("white");
               sonidoWhite.start();
             }
         });

         imgRosa.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
             textRosa.setText("Pink");
             sonidoPink.start();
             }
         });

          imgNegr.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                 textNegr.setText("black");
                 sonidoblack.start();
              }
          });

    }
}