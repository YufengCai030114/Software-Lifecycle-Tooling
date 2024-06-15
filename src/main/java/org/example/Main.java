
package org.example;
import org.example.TicTacToe;

public class Main {
        public static void main(String[] args) {
                TicTacToe game = new TicTacToe();
                System.out.println("Initial game setup:");
                System.out.println(game.printBoard());

                // Simulated sequence of moves
                int[][] moves = { {0, 0}, {1, 1}, {0, 1}, {1, 0}, {0, 2}, {2, 2} };
                for (int[] move : moves) {
                        if (game.makeMove(move[0], move[1])) {
                                System.out.println("Move made at (" + move[0] + ", " + move[1] + ")");
                                System.out.println(game.printBoard());
                                String result = game.checkForWin();
                                if (!result.equals("No winner yet.")) {
                                        System.out.println(result);
                                        break;
                                }
                                game.switchPlayer();
                        } else {
                                System.out.println("Invalid move at (" + move[0] + ", " + move[1] + "). Try again.");
                        }
                }
        }
}