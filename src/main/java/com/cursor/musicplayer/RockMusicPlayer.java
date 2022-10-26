package com.cursor.musicplayer;

import com.cursor.musicplayer.tracks.RockTrack1;
import com.cursor.musicplayer.tracks.RockTrack2;
import com.cursor.musicplayer.tracks.Track;

import java.util.ArrayList;

public class RockMusicPlayer implements Music{
    ArrayList<Track> trackList = new ArrayList<>();

    public RockMusicPlayer() {

        trackList.add(new RockTrack1());
        trackList.add(new RockTrack2());

    }


    public void playSongs(){
        for(Track track:trackList){
            System.out.println(track.getSongName()+" "+track.getAuthor());
        }

    }
}
