package com.HappyFamily;

import java.util.Arrays;

public class Pet {
    public String species;
    public String nickname;
    public int age;
    public int trickLevel;
    public String[] habits;

    public Pet(){}

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits){
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;

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
    public String toString(){
        return species + " {" + "nickname = \'" + nickname + "\'" + ", " + "age = " + age  + ", " + "trickLevel = " + trickLevel + ", " + "habits = " + Arrays.toString(habits) + "}";
    }


}
