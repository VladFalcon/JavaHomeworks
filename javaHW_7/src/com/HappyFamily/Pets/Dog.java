package com.HappyFamily.Pets;


import com.HappyFamily.Pet;
import com.HappyFamily.Species;

public class Dog extends Pet implements Foul {

    Dog(){ super(); }
    Dog(String nickname) {
        super(Species.DOG, nickname);
    }
    public Dog(String nickname, int age, int trickLevel, String[] habits) {
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
