package com.scedule;

import java.util.Scanner;

public class Scedule {
    String[][] schedule = new String[7][2];

   public Scedule() {
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work.";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film.";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "buy tickets; do home work.";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "visit grand-pa; go to courses.";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "do home work; go to the gym.";
        schedule[5][0] = "Friday";
        schedule[5][1] = "do home work; read the book.";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "go to courses; have some rest.";


    }

    static String setDay() {
        System.out.println("Please, input the day of the week:");
        Scanner in = new Scanner(System.in);
        String day = in.nextLine();
        return day.toUpperCase();
    }

    public void run(){
        Scanner task= new Scanner(System.in);
        String day = setDay();

        while (!day.equals("EXIT")) {
            if (day.contains("CHANGE")){

                day= day.substring(6).trim();

                switch (day) {
                    case "SUNDAY":
                        System.out.println("Please, input new tasks for Sunday.");
                        schedule[0][1]=task.nextLine();
                        break;
                    case "MONDAY":
                        System.out.println("Please, input new tasks for Monday.");
                        schedule[1][1]=task.nextLine();
                        break;
                    case "TUESDAY":
                        System.out.println("Please, input new tasks for Tuesday.");
                        schedule[2][1]=task.nextLine();
                        break;
                    case "WEDNESDAY":
                        System.out.println("Please, input new tasks for Wednesday.");
                        schedule[3][1]=task.nextLine();
                        break;
                    case "THURSDAY":
                        System.out.println("Please, input new tasks for Thursday.");
                        schedule[4][1]=task.nextLine();
                        break;
                    case "FRIDAY":
                        System.out.println("Please, input new tasks for Friday.");
                        schedule[5][1]=task.nextLine();
                        break;
                    case "SATURDAY":
                        System.out.println("Please, input new tasks for Saturday.");
                        schedule[6][1]=task.nextLine();
                        break;
                    default:
                        System.out.println("Sorry, I don't understand you, please try again.");
                }
            }
            else {
                switch (day) {
                    case "SUNDAY":
                        System.out.println("Your tasks for Sunday: " + schedule[0][1]);
                        break;
                    case "MONDAY":
                        System.out.println("Your tasks for Monday: " + schedule[1][1]);
                        break;
                    case "TUESDAY":
                        System.out.println("Your tasks for Tuesday: " + schedule[2][1]);
                        break;
                    case "WEDNESDAY":
                        System.out.println("Your tasks for Wednesday: " + schedule[3][1]);
                        break;
                    case "THURSDAY":
                        System.out.println("Your tasks for Thursday: " + schedule[4][1]);
                        break;
                    case "FRIDAY":
                        System.out.println("Your tasks for Friday: " + schedule[5][1]);
                        break;
                    case "SATURDAY":
                        System.out.println("Your tasks for Saturday: " + schedule[6][1]);
                        break;
                    default:
                        System.out.println("Sorry, I don't understand you, please try again.");
                }}
            day = setDay();
        }
    }
}
