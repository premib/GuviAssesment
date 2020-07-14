package com.example.wild;

import com.example.GameConsole2;

public class Tiger extends WildAnimal implements GameConsole2 {

    String tamer = "";

    public Tiger(String name, String tamer){
        super(name, "Tiger", "Grrr");
        this.tamer = tamer;
    }

    Tiger(String name, String tamer, int legs){
        super(name, "Tiger", "Grrr");
        numberOfLegs = legs;
    }

}
