package com.example.console;

import com.example.GameConsole;
import com.example.animal.Cat;
import com.example.animal.Dog;
import com.example.music.MusicPlayer;

import java.util.ArrayList;
import java.util.List;

public class GameConsole1 {

    private static List<GameConsole> playableList = new ArrayList<>();

    public static void makeAllPlay() {
        playableList.forEach(GameConsole::play);
    }

    public static void main(String[] args) {

        Dog dog = new Dog("Scooby", "Ganesh");
        Cat cat = new Cat("Bella", "Babu", 3);
        MusicPlayer musicPlayer = new MusicPlayer(new String[] {
                "alpha.mp3",
                "beta.mp3",
                "gamma.mp3"
        });

        playableList.add(dog);
        playableList.add(cat);
        playableList.add(musicPlayer);

        makeAllPlay();

    }
}
