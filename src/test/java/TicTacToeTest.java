
import static org.junit.Assert.*;

import org.example.TicTacToe;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TicTacToeTest {
    private TicTacToe game;

    @Before
    public void setUp() {
        game = new TicTacToe();
    }

    @Test
    public void testMakingMove() {
        assertTrue("Player should be able to place X at (0, 0)", game.makeMove(0, 0));
        assertEquals("X", game.printBoard().trim().charAt(0));
        assertFalse("Player should not be able to place X at (0, 0) again", game.makeMove(0, 0));
    }
    @Test
    public void testCurrentGameState() {
        game.makeMove(0, 0); // X
        game.makeMove(1, 1); // O
        String expectedBoard = "X - - \n- O - \n- - - \n";
        assertEquals("Board should match expected state after two moves", expectedBoard.trim(), game.printBoard().trim());
    }
    @Test
    public void testGameEndWin() {
        game.makeMove(0, 0); // X
        game.makeMove(0, 1); // O
        game.makeMove(1, 0); // X
        game.makeMove(0, 2); // O
        game.makeMove(2, 0); // X wins
        assertEquals("Game over. Winner: X", game.checkForWin());
    }
}