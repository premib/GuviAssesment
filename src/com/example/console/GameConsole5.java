package com.example.console;

import com.example.GameConsole;
import com.example.animal.Animal;
import com.example.animal.Dog;


import java.util.ArrayList;
import java.util.List;

public class GameConsole5 extends Thread{


    private List<Animal> animalList;
    private void create(){
        for (; ; ) {
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Dog reference = new Dog("Scooby", "Ganesh");
            animalList.add(reference);
            destroy(reference);
        }
    }

    private void destroy(Dog ref){
        for (; ; ) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ref = null;
        }
    }
    public void run() {


    }

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        System.out.println(String.format("Maximum Memory      : %6.2f mb", runtime.maxMemory() / (1024.0 * 1024)));
        System.out.println(String.format("Current used Memory : %6.2f mb", runtime.totalMemory() / (1024.0 * 1024)));
        System.out.println(String.format("Free Memory         : %6.2f mb", runtime.freeMemory() / (1024.0 * 1024)));

        GameConsole4 gc51 = new GameConsole4();
        GameConsole5 gc52 = new GameConsole5();
        Thread t1 = new Thread(gc51);
        Thread t2 = new Thread(gc52);
        
        t1.start();
        t2.start();



    }
}
