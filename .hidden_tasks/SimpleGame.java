public class SimpleGame {
    
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
    
    /**
     * Simulate player movement.
     * For each move, decrease player's health and score.
     */
    public static void movePlayer() {
        for (int moves = 0; moves < 5; moves++) {
            playerHealth -= 2; // Decreasing health per move
            playerScore -= 1;  // Decreasing score per move
            System.out.println("Player moves. Health: " + playerHealth + ", Score: " + playerScore);
        }
    }
    
    /**
     * Simulate enemy encounter.
     * Overloaded method based on attack type.
     */
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
    
    /**
     * Update player's score when collecting items.
     * @param itemCollected True if an item is collected.
     */
    public static void collectItem(boolean itemCollected) {
        if (itemCollected) {
            playerScore += 10;
            System.out.println("Collected an item! Score: " + playerScore);
        }
    }
}