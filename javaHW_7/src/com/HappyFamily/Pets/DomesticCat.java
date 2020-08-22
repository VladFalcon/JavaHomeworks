package com.HappyFamily.Pets;

import com.HappyFamily.Pet;
import com.HappyFamily.Pets.Foul;
import com.HappyFamily.Species;

public class DomesticCat extends Pet implements Foul {

    DomesticCat(){
        super();
    }
    DomesticCat(String nickname) {
        super(Species.DOMESTICCAT, nickname);
    }
    DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
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
