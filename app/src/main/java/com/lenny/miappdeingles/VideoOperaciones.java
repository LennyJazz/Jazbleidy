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

public class VideoOperaciones extends AppCompatActivity {
    VideoView videopera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_video_operaciones);

        videopera=findViewById(R.id.VideOperaciones);
        String videovo="android.resource://" + getPackageName()+ "/" + R.raw.operacionesbasi;
        Uri uri=Uri.parse(videovo);

        videopera.setVideoURI(uri);

        MediaController mediaController=new MediaController(this);
        videopera.setMediaController(mediaController);
        mediaController.setAnchorView(videopera);

        videopera.start();

    }
}