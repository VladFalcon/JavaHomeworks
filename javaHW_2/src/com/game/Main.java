package com.game;

public class Main {
    public static void main(String[] args) {

    Square square = new Square();
    Game newGame = new Game(square);
    newGame.run();


    }
}
