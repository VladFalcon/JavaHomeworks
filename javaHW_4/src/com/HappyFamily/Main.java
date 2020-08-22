package com.HappyFamily;

public class Main {
    public static void main(String[] args) {
        String[] habits = {"eat", "drink", "sleep"};
        Pet pet = new Pet("Dog", "Valera", 7,70,habits);

        Human mother = new Human("Belcalis", "Almánzar");
        Human father = new Human("Kiari", "Cephus");
        Human chield = new Human("Quavious", "Marshall", 2000, 50, mother,father,pet);
        chield.describePet();
        chield.feedPet(false);
        System.out.println(pet);
        System.out.println(chield);

    }


}
