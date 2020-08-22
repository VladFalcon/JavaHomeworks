package com.happyfamily;

import java.util.Set;

public class DomesticCat extends Pet implements Foul{


    DomesticCat(){
        super();
    }
    DomesticCat(String nickname) {
        super(nickname, Species.DOMESTICCAT);
    }
    DomesticCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits, Species.DOMESTICCAT);
    }

    @Override
    public void respond(){
        {System.out.println("Привет, хозяин. Я - " + getNickname() + ". Я соскучился!");}
    }
    @Override
    public void foul(){
        System.out.println("Нужно хорошо замести следы...");
    }
}

