package com.happyfamilly;

import java.text.ParseException;
import java.util.Map;

public final class Man extends Human {

    public Man(){
        super();
    }

    public Man(String name, String surname, String birthDay) throws ParseException {
        super(name, surname, birthDay);
    }
    public Man(String name, String surname, String birthDay, int iq, Family family, Map<DayOfWeek, String> schedule) throws ParseException {
        super(name, surname, birthDay, iq, family, schedule);
    }

    public Man(String name, String surname, String birthDay, int iq) throws ParseException {
        super(name, surname, birthDay, iq);
    }


    public void repairCar(){
        System.out.println("Чиню машину.");
    }

    @Override
    public void greetPet(){
        System.out.println("Привет, животное ");
    }
}
