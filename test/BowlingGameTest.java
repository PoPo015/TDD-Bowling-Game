import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGameTest {

    private Game game;

    @BeforeEach
    public void setUp(){
        game = new Game();
    }

    @Test
    public void canRoll(){
        game.roll(0);
    }


}