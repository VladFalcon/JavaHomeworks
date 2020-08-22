package com.HappyFamily.Humans;

import com.HappyFamily.Family;

public final class Woman extends Human {

    Woman(){
        super();
    }
    Woman(String name, String surname, int year){
        super(name, surname, year);
    }
    public Woman(String name, String surname, int year, int iq, Family family, String[][] schedule){
        super(name, surname, year, iq, family, schedule);
    }

    public void makeUp(){
        System.out.println("Делаю макияж.");
    }

    @Override
    public void greetPet(){
        System.out.println("Приветик");
    }
}
