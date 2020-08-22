package com.HappyFamily.Humans;

import com.HappyFamily.Family;

public final class Man extends Human {

    Man(){
        super();
    }
    Man(String name, String surname, int year){
        super(name, surname, year);
    }
    public Man(String name, String surname, int year, int iq, Family family, String[][] schedule){
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
