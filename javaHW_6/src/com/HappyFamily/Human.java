package com.HappyFamily;

import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;
    private Family family;

    public Human(){}

    public Human(String name, String surname,int year){
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, Family family, String[][] schedule) {
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

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void greetPet(){
        System.out.println("Привет, " + family.getPet().getNickname());
    }
    public void describePet(){
        System.out.println("У меня есть " + family.getPet().getSpecies() + ", ему " + family.getPet().getAge() + " лет, он " + family.getPet().varTrickLevel());
    }

    public boolean feedPet(boolean isTimeToFeed){
        int trickLevel = family.getPet().getTrickLevel();

        if(isTimeToFeed){
            System.out.println("Накормил " + family.getPet().getNickname());
        }else {
            Random random = new Random();
            int startNum = 0;
            int endNum = 100;
            int randomResult = startNum + random.nextInt(endNum - startNum + 1);
            if(trickLevel > randomResult){
                System.out.println("Хм... покормлю ка я, " + family.getPet().getNickname());
            }else{
                System.out.println("Думаю, " + family.getPet().getNickname() + " не голоден.");
                return false;
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
