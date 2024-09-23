package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class SimpleGameTest {

    private SimpleGame simpleGame;

    @Before
    public void setUp() {
        SimpleGame.main(new String[]{}); // Resets static variables
    }

    @Test
    public void testPlayerMoves() {
        SimpleGame.movePlayer();
        // After 5 moves, health decreases by 10, score decreases by 5
        assertEquals(90, SimpleGame.playerHealth);
        assertEquals(-5, SimpleGame.playerScore);
    }

    @Test
    public void testBasicAttack() {
        SimpleGame.encounterEnemy("basicAttack");
        // Basic attack reduces health by 10 and increases score by 20
        assertEquals(90, SimpleGame.playerHealth);
        assertEquals(20, SimpleGame.playerScore);
    }

    @Test
    public void testPowerMove() {
        SimpleGame.encounterEnemy("powerMove");
        // Power move reduces health by 20 and increases score by 50
        assertEquals(80, SimpleGame.playerHealth);
        assertEquals(50, SimpleGame.playerScore);
    }

    @Test
    public void testCustomDamageAttack() {
        SimpleGame.encounterEnemy(15);
        // Custom attack only increases score by damage value
        assertEquals(0, SimpleGame.playerHealth); // Health unaffected in damage attack
        assertEquals(15, SimpleGame.playerScore);
    }

    @Test
    public void testCollectItem() {
        SimpleGame.collectItem(true);
        // Collect an item increases score by 10
        assertEquals(0, SimpleGame.playerHealth); // Health unaffected by item
        assertEquals(10, SimpleGame.playerScore);
    }
}