package com.happyfamilly.humans;

import com.happyfamilly.DayOfWeek;
import com.happyfamilly.Family;
import com.happyfamilly.Pet;
import com.happyfamilly.Species;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Map<DayOfWeek, String> schedule = new HashMap<>();
    private Family family;

    public Human(){}

    public Human(String name, String surname,int year){
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, Family family, Map<DayOfWeek, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.family = family;
        this.schedule = schedule;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getIq() {
        return iq;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Map<DayOfWeek, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<DayOfWeek, String> schedule) {
        this.schedule = schedule;
    }


    public void setFamily(Family family) {
        this.family = family;
    }

    public abstract void greetPet();

    public void describePet() {
        if (family == null || family.getPets() == null) {
            System.out.println("Нет животного");
        } else {
            for (Pet pet : family.getPets()) {
                Species petSpecies = pet.getSpecies();
                int petAge = pet.getAge();
                String petVarTrickLevel = pet.varTrickLevel();
                System.out.println("У меня есть " + petSpecies + ", ему " + petAge + " лет, он " + petVarTrickLevel);
            }
        }
    }

        public boolean feedPet(boolean isTimeToFeed){
            if(family == null || family.getPets() == null){
                return false;
            }else {
                for(Pet pet : family.getPets()){
                    int trickLevel = pet.getTrickLevel();
                    if(isTimeToFeed){
                        System.out.println("Накормил " + pet.getNickname());
                    }else {
                        Random random = new Random();
                        int startNum = 0;
                        int endNum = 100;
                        int randomResult = startNum + random.nextInt(endNum - startNum + 1);
                        if(trickLevel > randomResult){
                            System.out.println("Хм... покормлю ка я, " + pet.getNickname());
                        }else{
                            System.out.println("Думаю, " + pet.getNickname() + " не голоден.");
                            return false;
                        }
                    }
                    return true;
                }
            }

            return true;
        }



        @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString(){
        return "Human " + " {" + "name = \'" + name + "\'" + ", " + "surname = \'" + surname + "\'" + ", " + "year = " + year + ", " + "iq = " + iq + ", " + " schedule= " + schedule + " }";
    }

    @Override
    protected void finalize(){
        System.out.println("Finalize human: " + toString());
    }






}
