package com.example.console;

import com.example.animal.Animal;
import com.example.animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class GameConsole4 extends Thread {
    List<Animal> animalList = new ArrayList<>();
    public void run(){
        try {


            for (; ; ) {
                Thread.sleep(1);
                animalList.add(new Dog("Scooby", "Ganesh"));
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        System.out.println(String.format("Maximum Memory      : %6.2f mb", runtime.maxMemory() / (1024.0 * 1024)));
        System.out.println(String.format("Current used Memory : %6.2f mb", runtime.totalMemory() / (1024.0 * 1024)));
        System.out.println(String.format("Free Memory         : %6.2f mb", runtime.freeMemory() / (1024.0 * 1024)));

    }
}
