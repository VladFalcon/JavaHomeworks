package com.happyfamilly;

import java.util.Set;

public class Fish extends Pet {

    ///CONSTRUCTOR
    Fish(){
        super();
    }
    Fish(String nickname) {
        super(nickname, Species.FISH);
    }
    Fish(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits, Species.FISH);
    }
    @Override
    public void respond(){
        {System.out.println("Буль, буль, буль хозяин, мы рыбки. " + getNickname());}
    }

}
