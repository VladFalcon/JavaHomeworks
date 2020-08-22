package com.happyfamilly.pets;


import com.happyfamilly.Pet;
import com.happyfamilly.Species;

import java.util.Set;

public class Dog extends Pet implements FoulingPet {

    public Dog(){ super(); }
    Dog(String nickname) {
        super(Species.DOG, nickname);
    }
    public Dog(String nickname, int age, int trickLevel, Set<String> habits) {
        super(Species.DOG, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond(){
        {System.out.println("Привет, хозяин. Я - " + getNickname() + ". ГАВ, ГАВ, ГАВ!!!");}
    }
    @Override
    public void foul(){
        System.out.println("Нужно замести следы! ГАВ!");
    }

}
