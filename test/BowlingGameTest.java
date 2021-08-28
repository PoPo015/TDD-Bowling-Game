import org.junit.jupiter.api.Assertions;
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

        for(int i=0; i<20; i++) game.roll(0);

        assertEquals(0,game.getscore());
    }


}