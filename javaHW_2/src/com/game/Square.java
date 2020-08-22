package com.game;

public class Square {

    private String columnNumber;
    private String rowNumber;
    private String[] target = new String[3];

    private String[][] square = {
            {"0","1","2","3","4","5"},
            {"1","-","-","-","-","-"},
            {"2","-","-","-","-","-"},
            {"3","-","-","-","-","-"},
            {"4","-","-","-","-","-"},
            {"5","-","-","-","-","-"}
    };

    public String[][] getSquare() {
        return square;
    }

    public void setSquare(String[][] square) {
        this.square = square;
    }

    public String getColumnNumber() {
        return columnNumber;
    }

    public void setColumnNumber(String columnNumber) {
        this.columnNumber = columnNumber;
    }

    public String getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(String rowNumber) {
        this.rowNumber = rowNumber;
    }

    public String[] getTarget() {
        return target;
    }

    public void setTarget(String target1, String target2, String target3) {
        this.target[0] = target1;
        this.target[1] = target2;
        this.target[2] = target3;
    }

    public void printSquare(String[][] arr){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(arr[i][j] + " |" + "\t");
            }
            System.out.println();
        }
    }
}
