package com.happyfamilly;

import com.happyfamilly.humans.Man;
import com.happyfamilly.humans.Woman;
import com.happyfamilly.pets.Dog;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class    Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Set<String> habitsD = new HashSet<>();
        habitsD.add("sleep");
        habitsD.add("eat");
        habitsD.add("drink");
        dog.setHabits(habitsD);

        Man father = new Man("Belcalis", "Almánzar", 25);

        Map<DayOfWeek, String> scheduleFather = new HashMap<>();
        scheduleFather.put(DayOfWeek.MONDAY, " Стрижка");
        scheduleFather.put(DayOfWeek.TUESDAY, " Танцы");
        scheduleFather.put(DayOfWeek.WEDNESDAY, " Пиво");
        scheduleFather.put(DayOfWeek.THURSDAY, " Пиво");
        scheduleFather.put(DayOfWeek.FRIDAY, " Курсы");
        scheduleFather.put(DayOfWeek.SATURDAY, "Пиво");
        scheduleFather.put(DayOfWeek.SUNDAY, "Пиво");
        father.setSchedule(scheduleFather);

        Woman mother = new Woman("Kiari", "Cephus", 25);

        Map<DayOfWeek, String> scheduleM = new HashMap<>();
        scheduleM.put(DayOfWeek.MONDAY, " Шоппинг");
        scheduleM.put(DayOfWeek.TUESDAY, "Шоппинг");
        scheduleM.put(DayOfWeek.WEDNESDAY, "Работа");
        scheduleM.put(DayOfWeek.THURSDAY, "Работа");
        scheduleM.put(DayOfWeek.FRIDAY, " Работа");
        scheduleM.put(DayOfWeek.SATURDAY, "Работа");
        scheduleM.put(DayOfWeek.SUNDAY, " Работа");
        mother.setSchedule(scheduleM);

        Man child = new Man("Vasia", "Petrov", 12);


        Map<DayOfWeek, String> scheduleS = new HashMap<>();
        scheduleS.put(DayOfWeek.MONDAY, " Школа");
        scheduleS.put(DayOfWeek.TUESDAY, " Школа");
        scheduleS.put(DayOfWeek.WEDNESDAY, "Школа");
        scheduleS.put(DayOfWeek.THURSDAY, " Школа");
        scheduleS.put(DayOfWeek.FRIDAY, "Школа");
        scheduleS.put(DayOfWeek.SATURDAY, " Школа");
        scheduleS.put(DayOfWeek.SUNDAY, " Школа");
        child.setSchedule(scheduleS);



        Family family = new Family(father, mother);
        family.addChild(child);
        family.addPets(dog);
        father.greetPet();
        father.describePet();
        father.feedPet(true);
        System.out.println(family);








//        for (int i = 0; i < 1000000; i++) { Human human = new Human(); }


    }


}
