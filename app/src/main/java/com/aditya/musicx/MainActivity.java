package com.aditya.musicx;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer player;
    //for playing music
    public void play(View view){
        player.start();
    }
    //for pausing music
    public void pause(View view){
        player.pause();
    }
    //for stopping music
    public void stop(View view){
        player.stop();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player = MediaPlayer.create(this, R.raw.music);
    }

}
