package com.happyfamilly;

import java.util.Set;

public class Dog extends Pet implements Foul {


    Dog(){ super(); }
    Dog(String nickname) {
        super(nickname,Species.DOG);
    }
    Dog(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits, Species.DOG);
    }

    @Override
    public void respond(){
        {System.out.println("Привет, хозяин. Я - " + getNickname() + ". Я соскучился! ГАВ!");}
    }

    @Override
    public void foul(){
        System.out.println("Нужно хорошо замести следы... Хе, хе, хе...");
    }

}

