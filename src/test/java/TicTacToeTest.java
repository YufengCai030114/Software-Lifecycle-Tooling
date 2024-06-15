
import org.example.TicTacToe;
import org.junit.jupiter.api.BeforeEach;
;
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

}