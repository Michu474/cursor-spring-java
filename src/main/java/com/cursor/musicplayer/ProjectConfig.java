package com.cursor.musicplayer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("com.cursor.musicplayer")
public class ProjectConfig {

    @Bean
    MusicPlayer musicPlayer(){
        return new MusicPlayer(musicGenres());
    }
    @Bean
    ClassicalMusicPlayer classicalMusic(){
        return new ClassicalMusicPlayer();
    }
    @Bean
    RockMusicPlayer rockMusic(){
        return new RockMusicPlayer();
    }
    @Bean
    List<Music> musicGenres(){
//        return Arrays.asList(rockMusic(),classicalMusic());
        return new ArrayList<>(Arrays.asList(rockMusic(),classicalMusic()));
    }

}
