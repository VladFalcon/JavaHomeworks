package com.happyfamilly;

import java.text.ParseException;
import java.util.Map;

public final class Woman extends Human{


    public Woman(){
        super();
    }

    public Woman(String name, String surname, String birthDay) throws ParseException {
        super(name, surname, birthDay);
    }

    public Woman(String name, String surname, String birthDay, int iq, Family family, Map<DayOfWeek, String> schedule) throws ParseException {
        super(name, surname, birthDay, iq, family, schedule);
    }

    public Woman(String name, String surname, String birthDay, int iq) throws ParseException {
        super(name, surname, birthDay, iq);
    }


    public void makeUp(){
        System.out.println("Делаю макияж.");
    }

    @Override
    public void greetPet(){
        System.out.println("Привет, хороший ");
    }
}

