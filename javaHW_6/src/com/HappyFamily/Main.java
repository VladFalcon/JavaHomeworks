package com.HappyFamily;

public class Main {
    public static void main(String[] args) {
        String[] habits = {"eat", "drink", "sleep"};
        Pet pet = new Pet(Species.DOG, "Valera", 7,70, habits);


        String[][] scheduleFather = new String[2][7];
        scheduleFather[0][0] = DayOfWeek.MONDAY.name();
        scheduleFather[0][1] = DayOfWeek.TUESDAY.name();
        scheduleFather[0][2] = DayOfWeek.WEDNESDAY.name();
        scheduleFather[0][3] = DayOfWeek.THURSDAY.name();
        scheduleFather[0][4] = DayOfWeek.FRIDAY.name();
        scheduleFather[0][5] = DayOfWeek.SATURDAY.name();
        scheduleFather[0][6] = DayOfWeek.SUNDAY.name();
        scheduleFather[1][0] = "Курсы";
        scheduleFather[1][1] = "Зал";
        scheduleFather[1][2] = "Работа";
        scheduleFather[1][3] = "Зал";
        scheduleFather[1][4] = "Выходной";
        scheduleFather[1][5] = "Работа";
        scheduleFather[1][6] = "Работа";

        String[][] scheduleMother = new String[2][7];
        scheduleMother[0][0] = DayOfWeek.MONDAY.name();
        scheduleMother[0][1] = DayOfWeek.TUESDAY.name();
        scheduleMother[0][2] = DayOfWeek.WEDNESDAY.name();
        scheduleMother[0][3] = DayOfWeek.THURSDAY.name();
        scheduleMother[0][4] = DayOfWeek.FRIDAY.name();
        scheduleMother[0][5] = DayOfWeek.SATURDAY.name();
        scheduleMother[0][6] = DayOfWeek.SUNDAY.name();
        scheduleMother[1][0] = "Магазины";
        scheduleMother[1][1] = "Работа";
        scheduleMother[1][2] = "Дома";
        scheduleMother[1][3] = "Курсы";
        scheduleMother[1][4] = "Работа";
        scheduleMother[1][5] = "Работа";
        scheduleMother[1][6] = "Работа";

        String[][] scheduleChield = new String[2][7];
        scheduleChield[0][0] = DayOfWeek.MONDAY.name();
        scheduleChield[0][1] = DayOfWeek.TUESDAY.name();
        scheduleChield[0][2] = DayOfWeek.WEDNESDAY.name();
        scheduleChield[0][3] = DayOfWeek.THURSDAY.name();
        scheduleChield[0][4] = DayOfWeek.FRIDAY.name();
        scheduleChield[0][5] = DayOfWeek.SATURDAY.name();
        scheduleChield[0][6] = DayOfWeek.SUNDAY.name();
        scheduleChield[1][0] = "Школа";
        scheduleChield[1][1] = "Школа";
        scheduleChield[1][2] = "Школа";
        scheduleChield[1][3] = "Школа";
        scheduleChield[1][4] = "Школа";
        scheduleChield[1][5] = "Школа";
        scheduleChield[1][6] = "Школа";




        Human mother = new Human("Belcalis", "Almánzar",25);
        Human father = new Human("Kiari", "Cephus",25);
        Human chield = new Human("Quavious", "Marshall",25);
        chield.describePet();
        chield.feedPet(false);
        System.out.println(pet);
        System.out.println(chield);




//        for (int i = 0; i < 1000000; i++) { Human human = new Human(); }


    }


}
