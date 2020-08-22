package com.happyfamily;

import java.util.Map;

public final class Woman extends Human{


    Woman(){
        super();
    }
    Woman(String name, String surname, int year){
        super(name, surname, year);
    }
    Woman(String name, String surname, int year, int iq, Family family, Map<DayOfWeek, String> schedule){
        super(name, surname, year, iq, family, schedule);
    }


    public void makeUp(){
        System.out.println("Делаю макияж.");
    }

    @Override
    public void greetPet(){
        System.out.println("Привет, хороший ");
    }
}
