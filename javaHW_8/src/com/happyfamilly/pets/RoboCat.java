package com.happyfamilly.pets;

import com.happyfamilly.Pet;
import com.happyfamilly.Species;

import java.util.Set;

public class RoboCat extends Pet {

    RoboCat(){
        super();
    }
    RoboCat(String nickname) {
        super(Species.ROBOCAT, nickname);
    }
    RoboCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(Species.ROBOCAT, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond(){
        {System.out.println("00010101010 " + getNickname() + ". 11111111");}
    }
}

