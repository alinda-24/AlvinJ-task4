package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class SimpleGame {

    private static int playerHealth = 100;
    private static int playerScore = 0;

    public static void main(String[] args) {
        boolean gameRunning = true;

        while (gameRunning) {
            System.out.println("Player Health: " + playerHealth + ", Score: " + playerScore);

            // Simulate player action
            movePlayer();
            encounterEnemy("basicAttack");

            if (playerHealth <= 0) {
                System.out.println("Game Over!");
                gameRunning = false;
            }
        }
    }

    public static void movePlayer() {
        for (int moves = 0; moves < 5; moves++) {
            playerHealth -= 2;
            playerScore -= 1;
            System.out.println("Player moves. Health: " + playerHealth + ", Score: " + playerScore);
        }
    }

    public static void encounterEnemy(int damage) {
        playerScore += damage;
        System.out.println("Attacked enemy with damage: " + damage + ". Score: " + playerScore);
    }

    public static void encounterEnemy(String specialMove) {
        if (specialMove.equals("basicAttack")) {
            playerHealth -= 10;
            playerScore += 20;
        } else if (specialMove.equals("powerMove")) {
            playerHealth -= 20;
            playerScore += 50;
        }
        System.out.println("Performed " + specialMove + ". Health: " + playerHealth + ", Score: " + playerScore);
    }

    public static void collectItem(boolean itemCollected) {
        if (itemCollected) {
            playerScore += 10;
            System.out.println("Collected an item! Score: " + playerScore);
        }
    }

    public static int getPlayerHealth() {
        return playerHealth;
    }

    public static int getPlayerScore() {
        return playerScore;
    }

    public static void resetPlayer() {
        playerHealth = 100;
        playerScore = 0;
    }
}

// LoopsTest.java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

