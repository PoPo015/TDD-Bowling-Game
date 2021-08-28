import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGameTest {

    private Game game;

    @BeforeEach
    public void setUp() {
        game = new Game();
    }

    @Test
    @DisplayName("0개씩 성공")
    public void canRoll() {
        rollMany(20, 0);
        assertEquals(0, game.getscore());
    }


    @Test
    @DisplayName("1개씩만 넘김")
    public void TestAllOnes() {
        rollMany(20, 1);
        assertEquals(20, game.getscore());
    }

    @Test
    @DisplayName("원스페어")
    public void testOnSpare(){
        rollSpare();
        game.roll(3);
        rollMany(17,0);
        assertEquals(16,game.getscore());

    }
    @Test
    @DisplayName("원스트라이크")
    public void testOneStrike(){
        game.roll(10);  //스트라이크
        game.roll(3);
        game.roll(4);
        rollMany(16,0);
        assertEquals(24,game.getscore());
    }

    @Test
    @DisplayName("300점 만점")
    public void testPerfectGame(){
        rollMany(12,10);
        assertEquals(300, game.getscore());
    }


    private void rollSpare() {
        game.roll(5);
        game.roll(5);   //space
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) game.roll(pins);
    }


}