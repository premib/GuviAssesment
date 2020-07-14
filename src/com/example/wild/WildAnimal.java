package com.example.wild;

import com.example.GameConsole2;
import com.example.animal.Animal;

public abstract class WildAnimal extends Animal implements GameConsole2 {

    protected WildAnimal(String name, String type, String sound){
        super(name, type, sound);
    }


    protected void eat(String food) {
        super.eat(food);
    }

    public void speak() {
        super.speak();
    }

    @Override
    protected void sleep() {
        super.sleep();
    }

    @Override
    public void tame() {
        System.out.println("Tamed: I am "+super.name+", a "+super.numberOfLegs+" legged "+super.getType());
    }

    @Override
    public void play() {
        System.out.println(super.name+" is playing with other "+this.getType()+"s");
    }
}
