package com.happyfamily;

import java.util.Map;

public final class Man extends Human {

    Man(){
        super();
    }
    Man(String name, String surname, int year){
        super(name, surname, year);
    }
    Man(String name, String surname, int year, int iq, Family family, Map<DayOfWeek, String> schedule){
        super(name, surname, year, iq, family, schedule);
    }

    ///METHODS
    public void repairCar(){
        System.out.println("Чиню машину.");
    }

    @Override
    public void greetPet(){
        System.out.println("Привет, животное ");
    }
}
