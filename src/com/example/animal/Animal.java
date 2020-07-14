package com.example.animal;

import com.example.GameConsole;

public abstract class Animal implements GameConsole {

    protected final String name;
    private final String type;
    private final String sound;
    protected int numberOfLegs = 4;

    protected Animal(String name,  String type, String sound){
        this.name = name;
        this.type = type;
        this.sound = sound;
    }


    protected void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    protected void sleep(){
        System.out.println(name+ " the " + type + " is going to sleep. Do not disturb.");
    }

    public void speak(){
        System.out.println(name+" the "+type+" is saying: "+sound+" "+sound+" "+sound+" "+sound+" "+sound+" "+sound+" ");
    }

    public String getName(){ return name; }

    public String getType(){
        return type;
    }

}
