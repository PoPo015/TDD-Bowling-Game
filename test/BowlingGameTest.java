import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGameTest {

    private Game game;

    @BeforeEach
    public void setUp(){
        game = new Game();
    }

    @Test
    @DisplayName("0개씩 성공")
    public void canRoll(){
        for(int i=0; i<20; i++) game.roll(0);
        assertEquals(0,game.getscore());
    }

    @Test
    @DisplayName("1개씩만 넘김")
    public void TestAllOnes(){
        for(int i = 0; i<20; i++){
            game.roll(1);
        }

        assertEquals(20,game.getscore());


    }


}