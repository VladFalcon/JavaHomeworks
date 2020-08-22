package com.happyfamilly.pets;

import com.happyfamilly.Pet;
import com.happyfamilly.Species;

import java.util.Set;

public class Fish extends Pet {

    Fish(){
        super();
    }
    Fish(String nickname) {
        super(Species.FISH, nickname);
    }
    Fish(String nickname, int age, int trickLevel, Set<String> habits) {
        super(Species.FISH, nickname, age, trickLevel, habits);
    }
    @Override
    public void respond(){
        {System.out.println("*Молчание*" + getNickname());}
    }

}

