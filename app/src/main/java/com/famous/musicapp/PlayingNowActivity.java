package com.famous.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.famous.musicapp.arrayList.MusicList;

public class PlayingNowActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_now);

        Bundle bundle = getIntent().getExtras();
        playing = bundle.getInt(MainActivity.Position);
        MusicList musicList = MainActivity.musicLists.get(playing);

        textView = findViewById(R.id.music_Name);
        textView.setText(musicList.getMusicName());

        imageView = findViewById(R.id.imgPL);
        imageView.setImageResource(musicList.getImg());

        textView = findViewById(R.id.artist_Name);
        textView.setText(musicList.getMusicArtist());


    }
}