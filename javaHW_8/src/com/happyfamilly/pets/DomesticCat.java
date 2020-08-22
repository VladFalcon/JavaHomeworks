package com.happyfamilly.pets;

import com.happyfamilly.Pet;
import com.happyfamilly.pets.FoulingPet;
import com.happyfamilly.Species;

import java.util.Set;

public class DomesticCat extends Pet implements FoulingPet {

    DomesticCat(){
        super();
    }
    DomesticCat(String nickname) {
        super(Species.DOMESTICCAT, nickname);
    }
    DomesticCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(Species.DOMESTICCAT,nickname, age, trickLevel, habits);
    }

    @Override
    public void respond(){
        {System.out.println("Привет, хозяин. Я - " + getNickname() + ". МУР, МУР, МУР!!!");}
    }
    @Override
    public void foul(){
        System.out.println("Нужно хорошо замести следы! МУР!");
    }
}
