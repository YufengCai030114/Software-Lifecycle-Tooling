import org.example.Board;

import org.example.TicTacToe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    private TicTacToe game;
    private MockInputHandler inputHandler;

    @BeforeEach
    void init() {
        int[][] moves = {
                {0, 0}, {0, 1}, {1, 1}, {1, 2}, {2, 2}
        };
        inputHandler = new MockInputHandler(moves);
        game = new TicTacToe(inputHandler);
    }

    @Test
    void testWinCondition() {
        game.startGame();
        assertTrue(game.hasWinner(), "Should have a winner");
    }
}