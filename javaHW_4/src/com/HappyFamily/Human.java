package com.HappyFamily;

import java.util.Random;

public class Human {
    public String name;
    public String surname;
    public int year;
    public int iq;
    public Pet pet;
    public Human mother;
    public Human father;
    public String[][] schedule;

    public Human(){}

    public Human(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Human(String name, String surname, int year, int iq, Human father, Human mother, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.father = father;
        this.mother = mother;
        this.pet = pet;
    }



    public void greetPet(){
        System.out.println("Привет, " + pet.nickname);
    }
    public void describePet(){
        System.out.println("У меня есть " + pet.species + ", ему " + pet.age + " лет, он " + pet.varTrickLevel());
    }

    public boolean feedPet(boolean isTimeToFeed){
        int trickLevel = pet.trickLevel;

        if(isTimeToFeed){
            System.out.println("Накормил " + pet.nickname);
        }else {
            Random random = new Random();
            int startNum = 0;
            int endNum = 100;
            int randomResult = startNum + random.nextInt(endNum - startNum + 1);
            if(trickLevel > randomResult){
                System.out.println("Хм... покормлю ка я, " + pet.nickname);
            }else{
                System.out.println("Думаю, " + pet.nickname + " не голоден.");
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString(){

        String motherStr = mother != null ? mother.name + " " + mother.surname: null;
        String fatherStr = father != null ? father.name + " " + father.surname: null;

        return "Human " + " {" + "name = \'" + name + "\'" + ", " + "surname = \'" + surname + "\'" + ", " + "year = " + year + ", " + "iq = " + iq + ", " + "mother = \'" + motherStr + "\', " + "father = \'" + fatherStr + "\', " + "Pet = " + pet + "}";
    }



}
