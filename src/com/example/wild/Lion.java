package com.example.wild;

import com.example.GameConsole2;
import com.example.animal.Animal;

public class Lion extends WildAnimal implements GameConsole2 {

    String tamer = "";

    public Lion(String name, String tamer){
        super(name, "Lion", "Rawrr");
        this.tamer = tamer;
    }

    Lion(String name, String tamer, int legs){
        super(name, "Lion", "Rawrr");
        numberOfLegs = legs;
    }



}
