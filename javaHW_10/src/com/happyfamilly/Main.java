package com.happyfamilly;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws ParseException {

        Pet dog = new Dog("Valera");
        dog.setAge(5);
        dog.setTrickLevel(90);
        Set<String> habitsD = new HashSet<>();
        habitsD.add("sleep");
        habitsD.add("eat");
        habitsD.add("drink");
        dog.setHabits(habitsD);

        Pet cat = new DomesticCat("Vasia");
        cat.setAge(2);
        cat.setTrickLevel(90);
        Set<String> habitsC = new HashSet<>();
        habitsC.add("eat");
        habitsC.add("play");
        habitsC.add("sleep");
        cat.setHabits(habitsC);

        System.out.println(" ");

        Man father1 = new Man("Vasya", "Petrov", "26/07/1954");
        father1.setIq(75);
        Woman mother1= new Woman("Marina", "Petrova", "26/07/1956");
        mother1.setIq(65);
        Family family1 = new Family(father1, mother1);

        Man father2 = new Man("Oleg", "Parjaev", "26/07/1957");
        father2.setIq(75);
        Woman mother2 = new Woman("Sveta", "Parjaev", "26/07/1959");
        mother2.setIq(65);
        Family family2 = new Family(father2, mother2);

        Man father3 = new Man("Igor", "Skor", "26/07/1950");
        father3.setIq(75);
        Woman mother3k = new Woman("Oksana", "Skor", "26/07/1959");
        mother3k.setIq(65);
        Family family3 = new Family(father3, mother3k);

        FamilyController familyController = new FamilyController();

        Man child1 = new Man("1", "1", "26/07/1981");
        Man child2 = new Man("2", "2", "26/07/1992");
        Man child3 = new Man("3", "3", "26/07/1993");
        Man child4 = new Man("4", "4", "26/07/1984");
        Man child5 = new Man("5", "5", "26/07/1955");
        Man child6 = new Man("6", "6", "26/07/1966");
        Man child7 = new Man("7", "7", "26/07/1977");

        familyController.adoptChild(family1, child1);
        familyController.adoptChild(family1, child4);
        familyController.bornChild(family1, null, "Maria");

        familyController.adoptChild(family2, child2);
        familyController.adoptChild(family2, child6);


        familyController.adoptChild(family3, child3);
        familyController.adoptChild(family3, child5);
        familyController.bornChild(family3, "Petr", null);

        familyController.saveFamily(family1);
        familyController.saveFamily(family2);
        familyController.saveFamily(family3);

        familyController.addPet(2, dog);
        familyController.addPet(3, cat);

        familyController.displayAllFamilies();
        familyController.count();
        familyController.getFamiliesBiggerThan(2);
        familyController.getFamiliesLessThan(5);
        familyController.countFamiliesWithMemberNumber(4);
        familyController.deleteFamilyByIndex(1);
        familyController.deleteFamilyByFamily(family1);
        familyController.deleteAllChildrenOlderThen(17);
        familyController.displayAllFamilies();
        familyController.getPets(1);

        father1.describeAge();

    }
}

