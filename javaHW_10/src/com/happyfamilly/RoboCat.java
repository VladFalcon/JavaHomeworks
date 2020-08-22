package com.happyfamilly;

import java.util.Set;

public class RoboCat extends Pet {


    RoboCat(){
        super();
    }
    RoboCat(String nickname) {
        super(nickname, Species.ROBOCAT);
    }
    RoboCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits, Species.ROBOCAT);
    }

    @Override
    public void respond(){
        {System.out.println("1110001 " + getNickname() + "0 0 0 0");}
    }
}
