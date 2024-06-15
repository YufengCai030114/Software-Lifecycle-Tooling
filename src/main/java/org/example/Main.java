package org.example;

public class Main {
    public static void main(String[] args) {
            TicTacToe game = new TicTacToe();
            System.out.println("Initial game setup:");
            System.out.println(game.printBoard());
            game.makeMove(0, 0);
            game.makeMove(1, 1);
            game.makeMove(0, 1);
            game.makeMove(1, 0);
            game.makeMove(0, 2);
            System.out.println("Updated game board after some moves:");
            System.out.println(game.printBoard());
        }
}