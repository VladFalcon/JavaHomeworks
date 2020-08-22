package com.happyfamilly.humans;


import com.happyfamilly.DayOfWeek;
import com.happyfamilly.Family;

import java.util.Map;

public final class Man extends Human {

    Man(){
        super();
    }
    public Man(String name, String surname, int year){
        super(name, surname, year);
    }
    public Man(String name, String surname, int year, int iq, Family family, Map<DayOfWeek, String> schedule){
        super(name, surname, year, iq, family, schedule);
    }


    public void repairCar(){
        System.out.println("Чиню машину.");
    }

    @Override
    public void greetPet(){
        System.out.println("Ну здарова");
    }
}
