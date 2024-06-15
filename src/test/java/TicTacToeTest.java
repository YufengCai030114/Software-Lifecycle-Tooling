
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
}