package com.example.console;

import com.example.animal.Animal;
import com.example.animal.Cat;
import com.example.animal.Dog;
import com.example.wild.Lion;
import com.example.wild.Tiger;
import com.example.wild.WildAnimal;

import java.util.*;
import java.util.stream.Collectors;

public class AnimalGame {

    private final List<Animal> animalList;
    private final List<String> speakingCompetitors;
    private final HashMap<String, Animal> competitors;

    AnimalGame(List<Animal> animals){
        animalList = animals;
        speakingCompetitors = new ArrayList<>();
        competitors = new HashMap<>();
        printAnimalTypeCountsNotInCompetition();
    }

    void printAnimalListAlphabetically(){
        animalList.stream().map(animal ->{
            competitors.put(((Animal)animal).getName(), animal);
            return ((Animal)animal).getName()+" - "+((Animal)animal).getType();
        }).sorted().forEach(System.out::println);
    }

    void addToSpeakingCompetition(List<String> animal){
        speakingCompetitors.addAll(animal);
    }

    void addToSpeakingCompetition(String animal){
        speakingCompetitors.add(animal);
    }

    void printAnimalTypeCountsNotInCompetition(){
        HashSet<String> findCulprit = (HashSet<String>) animalList.stream().map(Animal::getName).collect(Collectors.toSet());
        System.out.println( findCulprit.removeAll(new HashSet<String>(speakingCompetitors)));
        for(String temp: findCulprit){
            if(competitors.containsKey(temp)){
                System.out.println(temp+" the "+competitors.get(temp).getType()+" isn't participating in speaking competition");
            }
        }
    }

    void findAnimalByName(String name){
        if(competitors.containsKey(name)){
            Animal reference = competitors.get(name);
            System.out.println(name+" Found: "+reference.getClass()+" {type: '"+reference.getType()+"'}");
        }
        else{
            System.out.println(name+" not found");
        }
    }

    void play(){
        for (int i = speakingCompetitors.size()-1; i >= 0; i--){
            competitors.get(speakingCompetitors.get(i)).speak();
        }
    }

}
