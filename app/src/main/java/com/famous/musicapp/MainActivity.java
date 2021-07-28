package com.famous.musicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Button;

import com.famous.musicapp.arrayList.MusicList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    static String Position = "Position";

    static ArrayList<MusicList> musicLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);


        musicLists = new ArrayList<>() ;
        musicLists.add(new MusicList(getString(R.string.king),getString(R.string.fireboy), R.drawable.xample));
        musicLists.add(new MusicList(getString(R.string.kizz_daniel), getString(R.string.need_somebody), R.drawable.xample));
        musicLists.add(new MusicList(getString(R.string.pink_sweet), getString(R.string.atWorst), R.drawable.xample));
        musicLists.add(new MusicList(getString(R.string.WestLife), getString(R.string.need_somebody), R.drawable.xample));
        musicLists.add(new MusicList(getString(R.string.fireboy), getString(R.string.need_somebody), R.drawable.xample));
        musicLists.add(new MusicList(getString(R.string.kizz_daniel), getString(R.string.need_somebody), R.drawable.xample));
        musicLists.add(new MusicList(getString(R.string.king),getString(R.string.fireboy), R.drawable.xample));
        musicLists.add(new MusicList(getString(R.string.kizz_daniel), getString(R.string.need_somebody), R.drawable.xample));
        musicLists.add(new MusicList(getString(R.string.pink_sweet), getString(R.string.atWorst), R.drawable.xample));
        musicLists.add(new MusicList(getString(R.string.WestLife), getString(R.string.need_somebody), R.drawable.xample));
        musicLists.add(new MusicList(getString(R.string.fireboy), getString(R.string.need_somebody), R.drawable.xample));
        musicLists.add(new MusicList(getString(R.string.kizz_daniel), getString(R.string.Feel), R.drawable.xample));


        PagerAdapter adapter = new com.famous.musicapp.PagerAdapter(MainActivity.this, getSupportFragmentManager());

        viewPager.setAdapter(adapter);


    }
}