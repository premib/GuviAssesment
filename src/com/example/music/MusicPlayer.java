package com.example.music;

import com.example.GameConsole;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MusicPlayer implements GameConsole {


    private List<String> mediaFiles;
    private int currentMediaFileIndex = 0;
    private enum playerState{
        PLAYING,
        PAUSED,
        STOPPED
    };
    static Scanner scn = new Scanner(System.in);

    public MusicPlayer(String[] files){
        mediaFiles = Arrays.asList(files);
    }

    void addSong(String song){
        mediaFiles.add(song);
    }

    void deleteSong(){
        for (int i = 0; i < mediaFiles.size(); i++) {
            System.out.println((i+1)+". "+mediaFiles.get(i));
        }
        System.out.print("Which song do you want to delete? ");
        int temp = scn.nextInt();
        mediaFiles.remove(temp-1);
    }

    public void play(){
        System.out.println(mediaFiles.get(currentMediaFileIndex));
        currentMediaFileIndex = (currentMediaFileIndex+1)%mediaFiles.size();
    }
}
