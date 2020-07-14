package com.example.animal;

import com.example.GameConsole;

public class Cat extends Animal {
    private boolean needFood = false;
    private int foodIter = 0;
    private final String owner;

    public Cat(String name, String owners){
        super(name, "Cat", "meow");
        this.owner = owners;
    }

    public Cat(String name, String owners, int legs){
        super(name, "Cat", "meow");
        this.owner = owners;
        numberOfLegs = legs;
    }

    public void giveFood(String food){
        System.out.println("You have given your cat some "+food);
        eat(food);
        needFood = false;
    }

    public String checkOwner(){
        return owner;
    }

    @Override
    public void play() {
        if (!needFood) {
            System.out.println(numberOfLegs+ " legged "+name + " is playing. show it a mouse");
            if (++foodIter == 5) {
                needFood = true;
                System.out.println("Need food!!!");
            }
        } else {
            speak();
            System.out.println("Food first, Play next");
        }
    }

    public static void main(String[] args) {
        GameConsole cat = new Cat("kit", "prem");
        cat.play();
    }
}
