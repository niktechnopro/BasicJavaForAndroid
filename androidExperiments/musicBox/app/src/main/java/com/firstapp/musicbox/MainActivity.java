package com.firstapp.musicbox;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.util.*;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private Button playButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.alright);

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                int duration = mp.getDuration();
                String mDuration = String.valueOf(duration);
                Toast.makeText(getApplicationContext(), "duration " + mDuration, Toast.LENGTH_LONG).show();
            }
        });

        playButton = (Button) findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()) {
                    //stop and give option to start again
                    pauseMusic();
                    MediaPlayer.TrackInfo[] info = mediaPlayer.getTrackInfo();
                    for (int i = 0; i < info.length; i++) {
                        Log.d("trackInfo", "" + info[i]);
                    }
                    MediaPlayer.DrmInfo drm = mediaPlayer.getDrmInfo();
                    Log.d("trackInfo", "" + drm);
                }else{
                    int sessionId = mediaPlayer.getAudioSessionId();
                    Toast.makeText(getApplicationContext(), String.valueOf(sessionId), Toast.LENGTH_LONG).show();
                    startMusic();
                }
            }
        });

    }

    public void pauseMusic(){
        if (mediaPlayer != null){
            mediaPlayer.pause();
            playButton.setText("Play");
        }
    }

    public void startMusic() {
        if(mediaPlayer != null){
            mediaPlayer.start();
            playButton.setText("Pause");
        }
    }

    @Override
    protected void onDestroy() {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
        super.onDestroy();
        Log.d("trackInfo", "destroy");
    }
}


