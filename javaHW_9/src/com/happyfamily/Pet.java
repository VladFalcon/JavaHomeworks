package com.happyfamily;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pet {
    ///FIELD
    private Species species = Species.UNKNOWN;
    private String nickname;
    private int age;
    private int trickLevel;
    private Set<String> habits = new HashSet<>();

    static {
        System.out.println(" ");
        System.out.println("Загрузка класса: Pet");
    }
    {
        System.out.println("Cоздается новый объект: Pet");
    }


    Pet(){}
    Pet(String nickname, Species species) {
        this.nickname = nickname;
        this.species = species;
    }
    Pet(String nickname, int age, int trickLevel, Set<String> habits, Species species) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
        this.species = species;
    }


    public void eat() {
        System.out.println("Я кушаю!");
    }
    public abstract void respond();

    public String varTrickLevel(){
        String str = null;
        if(trickLevel > 50){
            str = "очень хитрый";
        }
        if(trickLevel <= 50){
            str = "почти не хитрый";
        }
        return str;
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
    public void setAge(int age) { this.age = age; }
    public int getTrickLevel() {
        return trickLevel;
    }
    public void setTrickLevel(int trickLevel) { this.trickLevel = trickLevel; }
    public Set<String> getHabits() {
        return habits;
    }
    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    @Override
    public String toString(){
        return species + " {" +
                "legs = " + species.getNumberOfLegs()+ ", " +
                "can fly = " + species.canFly()+ ", " +
                "has fur = " + species.hasFur() + ", " +
                "nickname = \'" + nickname + "\'" + ", " +
                "age = " + age  + ", " +
                "trickLevel = " + trickLevel + ", " +
                "habits = " + habits + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pet pet = (Pet) obj;
        return Objects.equals(species, pet.species) &&
                Objects.equals(nickname, pet.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname);
    }

    @Override
    protected void finalize(){
        System.out.println("Finalize pet: " + toString());
    }
}
