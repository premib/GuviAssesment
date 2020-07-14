package com.example.animal;


import com.example.GameConsole;

public class Dog extends Animal implements GameConsole {
    private boolean needFood = false;
    private int foodIter = 0;
    private final String owner;


    public Dog(String name, String owners){
        super(name, "Dog", "woof");
        this.owner = owners;
    }

    public Dog(String name, String owners, int legs){
        super(name, "Dog", "woof");
        this.owner = owners;
        numberOfLegs = legs;
    }

    public void giveFood(String food){
        System.out.println("You have given your dog some "+food);
        eat(food);
        needFood = false;
    }

    public String checkOwner(){
        return owner;
    }

    @Override
    public void play() {
        if (!needFood) {
            System.out.println(numberOfLegs+ " legged "+ name + " is playing. Throw a ball it can fetch");
            if (++foodIter == 5) {
                needFood = true;
                System.out.println("Need food!!!");
            }
        } else {
            speak();
            System.out.println("Food first, Play next");
        }
    }


}
