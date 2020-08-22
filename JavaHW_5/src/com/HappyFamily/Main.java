package com.HappyFamily;

public class Main {
    public static void main(String[] args) {
        String[] habits = {"eat", "drink", "sleep", "repeat"};
        Pet pet1 = new Pet("Dog", "Valera", 7,70, habits);
        Pet pet2 = new Pet("Cat", "Vasya", 3,99, habits);

        Human mother  = new Human("Cardi", "B");
        Human father = new Human("Offset", "Migos");
        Human child1 = new Human("Quavo", "Migos");
        Human child2 = new Human("Takeoff", "Migos");
        Human child3 = new Human("Travis", "Scot");

        Family family = new Family(mother, father);
        family.addChild(child1);
        family.addChild(child2);
        family.addChild(child3);
        System.out.println(family);
        family.deleteChild(2);
        System.out.println(family);

    }

}
