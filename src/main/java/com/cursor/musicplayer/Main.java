package com.cursor.musicplayer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.module.Configuration;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);

        musicPlayer.playClassicalMusic();
        System.out.println("\n");
        musicPlayer.playRockMusic();


    }
}