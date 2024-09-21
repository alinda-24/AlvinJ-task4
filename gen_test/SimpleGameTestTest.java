package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class SimpleGameTest {

    @Before
    public void setUp() {
        // Reset the static fields before each test
        SimpleGame.playerHealth = 100;
        SimpleGame.playerScore = 0;
    }

    @Test
    public void testInitialPlayerState() {
        assertEquals(100, SimpleGame.playerHealth);
        assertEquals(0, SimpleGame.playerScore);
    }

    @Test
    public void testMovePlayer() {
        SimpleGame.movePlayer();
        assertEquals(90, SimpleGame.playerHealth); // 5 moves, 2 health lost per move
        assertEquals(-5, SimpleGame.playerScore);  // 5 moves, 1 point lost per move
    }

    @Test
    public void testEncounterEnemyBasicAttack() {
        SimpleGame.encounterEnemy("basicAttack");
        assertEquals(90, SimpleGame.playerHealth); // Basic attack decreases health by 10
        assertEquals(20, SimpleGame.playerScore);  // Basic attack increases score by 20
    }

    @Test
    public void testEncounterEnemyPowerMove() {
        SimpleGame.encounterEnemy("powerMove");
        assertEquals(80, SimpleGame.playerHealth); // Power move decreases health by 20
        assertEquals(50, SimpleGame.playerScore);  // Power move increases score by 50
    }

    @Test
    public void testEncounterEnemyInvalidMove() {
        SimpleGame.encounterEnemy("invalidMove");
        assertEquals(100, SimpleGame.playerHealth); // No change
        assertEquals(0, SimpleGame.playerScore);    // No change
    }

    @Test
    public void testEncounterEnemyWithDamage() {
        SimpleGame.encounterEnemy(15);
        assertEquals(100, SimpleGame.playerHealth); // Health remains unchanged
        assertEquals(15, SimpleGame.playerScore);   // Score increased by damage
    }

    @Test
    public void testCollectItemTrue() {
        SimpleGame.collectItem(true);
        assertEquals(100, SimpleGame.playerHealth); // Health remains unchanged
        assertEquals(10, SimpleGame.playerScore);   // Score increased by 10
    }

    @Test
    public void testCollectItemFalse() {
        SimpleGame.collectItem(false);
        assertEquals(100, SimpleGame.playerHealth); // Health remains unchanged
        assertEquals(0, SimpleGame.playerScore);    // Score remains unchanged
    }
    
    @Test
    public void testGameOver() {
        SimpleGame.playerHealth = 5;
        SimpleGame.encounterEnemy("powerMove");
        assertEquals(false, SimpleGame.isPlayerAlive()); // Player should be dead
    }
    
    // Helper method to illustrate test for game over condition
    private static boolean isPlayerAlive() {
        return SimpleGame.playerHealth > 0;
    }
}