package com.lenny.miappdeingles;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class VideoVocal extends AppCompatActivity {
VideoView videovocal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_video_vocal);
videovocal=findViewById(R.id.VideoVocal);
String videovo="android.resource://" + getPackageName()+ "/" + R.raw.vocales;
        Uri uri=Uri.parse(videovo);

        videovocal.setVideoURI(uri);

        MediaController mediaController=new MediaController(this);
        videovocal.setMediaController(mediaController);
        mediaController.setAnchorView(videovocal);

        videovocal.start();



    }
}