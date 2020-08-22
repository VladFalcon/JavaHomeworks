package com.HappyFamily.Pets;

import com.HappyFamily.Pet;
import com.HappyFamily.Species;

public class Fish extends Pet {

    Fish(){
        super();
    }
    Fish(String nickname) {
        super(Species.FISH, nickname);
    }
    Fish(String nickname, int age, int trickLevel, String[] habits) {
        super(Species.FISH, nickname, age, trickLevel, habits);
    }
    @Override
    public void respond(){
        {System.out.println("*Молчание*" + getNickname());}
    }

}

