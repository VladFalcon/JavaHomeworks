package com.danit.game;

import java.util.Random;
import java.util.Scanner;

public class game {

        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.print("What is your name?");
        String name = in.nextLine();
        System.out.print("Let the game begin!");
        int RandomNumber = random.nextInt(101);
        while (true){
            int userNumber = in.nextInt();
            if (userNumber > RandomNumber)
                System.out.println("Your number is too big. Please, try again.");
            else if (userNumber < RandomNumber)
                System.out.println("Your number is too small. Please, try again.");
            else
                System.out.println("Congratulations " + name + "!" ) break;
        }

    }
}

