package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class SimpleGameTest {

    @Before
    public void setUp() {
        // Reset health and score for each test
        SimpleGame.resetPlayer();
    }

    @Test
    public void testMovePlayerUpdatesHealthAndScore() {
        SimpleGame.movePlayer();
        assertEquals(90, SimpleGame.getPlayerHealth());
        assertEquals(-5, SimpleGame.getPlayerScore());
    }

    @Test
    public void testEncounterEnemyBasicAttack() {
        SimpleGame.encounterEnemy("basicAttack");
        assertEquals(90, SimpleGame.getPlayerHealth());
        assertEquals(20, SimpleGame.getPlayerScore());
    }

    @Test
    public void testEncounterEnemyPowerMove() {
        SimpleGame.encounterEnemy("powerMove");
        assertEquals(80, SimpleGame.getPlayerHealth());
        assertEquals(50, SimpleGame.getPlayerScore());
    }

    @Test
    public void testEncounterEnemyCustomDamage() {
        SimpleGame.encounterEnemy(15);
        assertEquals(0, SimpleGame.getPlayerHealth()); // Health unaffected
        assertEquals(15, SimpleGame.getPlayerScore());
    }
    
    @Test
    public void testCollectItemIncreasesScore() {
        SimpleGame.collectItem(true);
        assertEquals(10, SimpleGame.getPlayerScore());
    }

    @Test
    public void testCollectItemNoEffectWhenNotCollected() {
        SimpleGame.collectItem(false);
        assertEquals(0, SimpleGame.getPlayerScore());
    }
}

// SimpleGame.java
