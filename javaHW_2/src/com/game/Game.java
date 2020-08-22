package com.game;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Game {

    private Scanner in = new Scanner(System.in);
    private Square square;

    public Game(Square square){
        this.square = square;
    }

    private int dataCheck(){
        String data = in.nextLine();
        int result;
        while(true){
            try{
                result = Integer.parseInt(data);
                if(result < 1 || result > 5){
                    System.out.println("Error! Please try again (from 1 to 5) : ");
                    data = in.nextLine();
                } else {
                    break;
                }
            } catch (NumberFormatException e){
                System.out.println("Wrong data, please try again : ");
                data = in.nextLine();
            }
        }
        return result;
    }

    private String rowNumber(){
        System.out.println("Please, enter row number : ");
        return Integer.toString(dataCheck());
    }

    private String columnNumber(){
        System.out.println("Please, enter column number :");
        return  Integer.toString(dataCheck());
    }


    private void randomDirect(String[][] array){
        int randomDirect = (int) (Math.random() * 2 + 0);
        int random = (int) (Math.random() * 5 + 1);

        if(randomDirect == 0){
            if (random > 0 && random < 4){
                square.setTarget(Integer.toString(random),Integer.toString(random + 1),Integer.toString(random + 2));
                array[random][random] = "-";
                array[random+1][random] = "-";
                array[random+2][random] = "-";

            } else if(random == 4){
                square.setTarget(Integer.toString(random - 1), Integer.toString(random), Integer.toString(random + 1));
                array[random - 1][random] = "-";
                array[random][random] = "-";
                array[random + 1][random] = "-";

            }else {
                square.setTarget(Integer.toString(random - 2), Integer.toString(random - 1), Integer.toString(random));
                array[random - 2][random] = "-";
                array[random - 1][random] = "-";
                array[random][random] = "-";
            }
        }else {
            if (random > 0 && random < 4){
                square.setTarget(Integer.toString(random),Integer.toString(random + 1),Integer.toString(random + 2));
                array[random][random] = "-";
                array[random][random+1] = "-";
                array[random][random+2] = "-";

            } else if(random == 4){
                square.setTarget(Integer.toString(random - 1), Integer.toString(random), Integer.toString(random + 1));
                array[random][random - 1] = "-";
                array[random][random] = "-";
                array[random][random + 1] = "-";

            }else {
                square.setTarget(Integer.toString(random - 2), Integer.toString(random - 1), Integer.toString(random));
                array[random][random - 2] = "-";
                array[random][random - 1] = "-";
                array[random][random] = "-";
            }
        }
    }

    public void run(){
        System.out.println("All set. Get ready to rumble!");
        randomDirect(square.getSquare());
        int count = 0;

        while (true){
            square.setRowNumber(rowNumber());
            square.setColumnNumber(columnNumber());
            square.setSquare(square.getSquare());

            String[] target = square.getTarget();
            boolean conditionRow = square.getRowNumber().equals(target[0]) || square.getRowNumber().equals(target[1]) || square.getRowNumber().equals(target[2]);
            boolean conditionCol = square.getColumnNumber().equals(target[0]) || square.getColumnNumber().equals(target[1]) || square.getColumnNumber().equals(target[2]);

            if (conditionRow && conditionCol) {
                square.getSquare()[Integer.parseInt(square.getRowNumber())][Integer.parseInt(square.getColumnNumber())] = "x";
                count++;
                System.out.println("Your square : ");
                square.printSquare(square.getSquare());
                if(count >= 3){
                    System.out.println("You have won!");
                    break;
                }
            }
            else{
                square.getSquare()[Integer.parseInt(square.getRowNumber())][Integer.parseInt(square.getColumnNumber())] = "*";
                System.out.println("Your square : ");
                square.printSquare(square.getSquare());
            }
        }
    }




}
