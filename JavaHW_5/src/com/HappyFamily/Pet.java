package com.HappyFamily;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    static {
        System.out.println("Загрузка класса : Pet");
    }
    {
        System.out.println("Cоздается новый объект : Pet");
    }

    public Pet(){}

    public Pet(String species, String nickname){
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits){
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;

    }

    public String getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void eat() {
        System.out.println("Я кушаю!");
    }
    public void respond() {
        System.out.println("Привет, хозяин. Я - " + nickname + ". Я соскучился!");
    }
    public void foul() {
        System.out.println("Нужно хорошо замести следы...");
    }
    public String varTrickLevel(){
        String str = null;
        if(trickLevel > 50){
            str = "\"очень хитрый\"";
        }
        if(trickLevel <= 50){
            str = "\"почти не хитрый\"";
        }
        return str;
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pet pet = (Pet) obj;
        return Objects.equals(species, pet.species) && Objects.equals(nickname, pet.nickname);
    }


    @Override
    public String toString(){
        return species + " {" + "nickname = \'" + nickname + "\'" + ", " + "age = " + age  + ", " + "trickLevel = " + trickLevel + ", " + "habits = " + Arrays.toString(habits) + "}";
    }


}
