public class SimpleGame {
    
    private static int playerHealth = 10;
    private static int playerScore = 100;
    private static int playerX;
    private static int playerY;

    public static void movePlayer(int steps) {
        for (int i = 0; i < steps; i++){
            playerX++;
            playerY++;
            playerScore -= 10;
            System.out.println("Player moved to position (" + playerX + ", " + playerY + ")");
            System.out.println("Player's current score: " + playerScore);
        }
    }
    public static void updatescore(boolean enemyDefeated, boolean itemCollected){
        if (enemyDefeated){
            playerScore += 50;
            System.out.println("Player defeated an enemy! Score increased by 50.");
            System.out.println("New score: " + playerScore );
        }
        if (itemCollected){
            playerScore += 10;
            System.out.println("Player collected an item! Score increased by 10.");
        }
    }
    public static void collectItem(boolean itemCollected) {
        if (itemCollected) {
            updateScore(false, true);
            System.out.println("Player collected an item!");
            System.out.println("Player's current score: " + playerScore);
        }
    }   
    public static void main(String[] args) {
        boolean gameRunning = true; 
        System.out.println("Welcome to the game");
        while (gameRunning){
            if (playerHealth <= 0){
                gameRunning = false;
            }
            for (int score = 0; score <= 100; score += 10) {
                System.out.println("Current Score: " + score);
            }
        }
    
    public static void encounterEnemy(int damage) {
        // TODO: Implement this method.
    }
    
    public static void encounterEnemy(String specialMove) {
        // TODO: Implement this method.
    }
    
}
}