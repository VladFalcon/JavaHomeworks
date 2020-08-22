package com.happyfamily;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

public abstract class Human{

    private String name;
    private String surname;
    private int year;
    private int iq;
    private Family family;
    private Map<DayOfWeek, String> schedule = new HashMap<>();

    static {
        System.out.println("Загрузка класса: Human");
    }
    {
        System.out.println("Cоздается новый объект: Human");
    }


    public Human() {}
    public Human(String name, String surname, int year) {
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



    ///METHODS
    public abstract void greetPet();
    public void describePet(){
        if(family == null || family.getPets() == null){
            System.out.println("Нет животного");
        }else {
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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getIq() {
        return iq;
    }
    public void setIq(int iq) {
        this.iq = iq;
    }
    public Family getFamily() {
        return family;
    }
    public void setFamily(Family family) {
        this.family = family;
    }

    public Map<DayOfWeek, String> getSchedule() {
        return schedule;
    }
    public void setSchedule(Map<DayOfWeek, String> schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString(){
        return  "Human" + " {" +
                "name = " + "\'" + name + "\'" + ", " +
                "surname = " + "\'" + surname + "\'" + ", " +
                "year = " + year + ", " +
                "iq = " + iq + ", " +
                "schedule = " + schedule + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Human human = (Human) obj;
        return year == human.year &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year);
    }

    @Override
    protected void finalize(){
        System.out.println("Finalize human: " + toString());
    }

}

