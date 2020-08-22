package com.happyfamilly.humans;


import com.happyfamilly.DayOfWeek;
import com.happyfamilly.Family;

import java.util.Map;

public final class Woman extends Human {

    Woman(){
        super();
    }
    public Woman(String name, String surname, int year){
        super(name, surname, year);
    }
    public Woman(String name, String surname, int year, int iq, Family family, Map<DayOfWeek, String> schedule){
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
