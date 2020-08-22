package com.HappyFamily;

import java.util.Arrays;
import java.util.Objects;

public abstract  class Pet {
    private Species species = Species.UNKNOWN;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(){}

    public Pet(Species species, String nickname){
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits){
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;

    }

    public Species getSpecies() {
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
    public abstract void respond();

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
        return species + " {" + "legs = " + species.getNumberOfLegs()+ ", " + "can fly = " + species.canFly()+ ", " + "has fur = " + species.hasFur() + ", " + "nickname = \'" + nickname + "\'" + ", " + "age = " + age  + ", " + "trickLevel = " + trickLevel + ", " + "habits = " + Arrays.toString(habits) + "}";
    }


    @Override
    protected void finalize(){
        System.out.println("Finalize pet: " + toString());
    }




}
