import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGame {
    @Test
    void testGame() {
        int mScore1 = 6;
        int mScore2 = 9;
        String expected = TennisGame.getScore("Lam","Tuan",mScore1,mScore2);
        String result = TennisGame.getScore("Lam","Tuan",mScore1,mScore2);
        assertEquals(expected,result);
    }
}
