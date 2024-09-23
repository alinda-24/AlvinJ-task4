package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class SimpleGameTest {

    @Before
    public void setUp() {
        SimpleGame.playerHealth = 100;
        SimpleGame.playerScore = 0;
    }

    @Test
    public void testMovePlayer() {
        SimpleGame.movePlayer();
        assertEquals(90, SimpleGame.playerHealth);
        assertEquals(-5, SimpleGame.playerScore);
    }

    @Test
    public void testEncounterEnemy_withDamage() {
        SimpleGame.encounterEnemy(10);
        assertEquals(10, SimpleGame.playerScore);
        assertEquals(100, SimpleGame.playerHealth);
    }

    @Test
    public void testEncounterEnemy_withSpecialMove_basicAttack() {
        SimpleGame.encounterEnemy("basicAttack");
        assertEquals(90, SimpleGame.playerHealth);
        assertEquals(20, SimpleGame.playerScore);
    }

    @Test
    public void testEncounterEnemy_withSpecialMove_powerMove() {
        SimpleGame.encounterEnemy("powerMove");
        assertEquals(80, SimpleGame.playerHealth);
        assertEquals(50, SimpleGame.playerScore);
    }

    @Test
    public void testCollectItem_itemCollected() {
        SimpleGame.collectItem(true);
        assertEquals(10, SimpleGame.playerScore);
    }

    @Test
    public void testCollectItem_noItemCollected() {
        SimpleGame.collectItem(false);
        assertEquals(0, SimpleGame.playerScore);
    }
}