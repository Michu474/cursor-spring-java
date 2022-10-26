package com.cursor.musicplayer;

import java.util.List;

public class MusicPlayer {

    List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {

        this.musicList = musicList;
    }


    public void playRockMusic(){

        musicList.get(0).playSongs();

    }

    public void playClassicalMusic(){

        musicList.get(1).playSongs();
    }
}
