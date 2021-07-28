package com.famous.musicapp.arrayList;

public class MusicList {
    private String musicName;
    private String musicArtist;
    private int img;



    public MusicList() {
    }

    public MusicList(String musicName, String musicArtist, int img) {
        this.musicName = musicName;
        this.musicArtist = musicArtist;
        this.img = img;

    }
    public String getMusicName() {
        return musicName;
    }

    public String getMusicArtist() {
        return musicArtist;
    }

    public int getImg() {
        return img;
    }
}
