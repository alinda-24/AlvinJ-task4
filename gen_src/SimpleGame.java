public class SimpleGame {

    private static int playerHealth = 20;  
    private static int playerScore = 100;  
    private static int playerX = 0;
    private static int playerY = 0;        
    private static int enemyHealth = 15;   

    public static void main(String[] args) {
        boolean gameRunning = true;

        System.out.println("Welcome to SimpleGame!");
        while (gameRunning) {
            movePlayer(5);
            encounterEnemy(15); 
            if (playerHealth <= 0) {
                System.out.println("Player's health has reached zero. Game over!");
                gameRunning = false;
            }
        }
        System.out.println("Game over! Final score: " + playerScore);
    }
    public static void movePlayer(int steps) {
        for (int i = 0; i < steps; i++) {
            playerX++;
            playerY++;
            playerScore -= 10;
            System.out.println("Player moved to position (" + playerX + ", " + playerY + ")");
            System.out.println("Player's current score: " + playerScore);
            if (playerScore <= 0) {
                System.out.println("Player's score has reached zero. Game over!");
                break;
            }
        }
    }
    public static void encounterEnemy(int enemyHealth) {
        System.out.println("You encountered an enemy with " + enemyHealth + " health points!");
        while (enemyHealth > 0 && playerHealth > 0) {
            int choice = getPlayerAction();
            if (choice == 1) {
                enemyHealth = attackEnemy(enemyHealth, 3);
            } else if (choice == 2) {
                enemyHealth = attackEnemy(enemyHealth, "fireball");
            }
            int enemyDamage = 2;
            playerHealth -= enemyDamage;
            System.out.println("The enemy retaliates and deals " + enemyDamage + " damage to the player.");
            System.out.println("Player's current health: " + playerHealth);
        }
        if (playerHealth > 0) {
            System.out.println("Player defeated the enemy!");
            updateScore(true, false);
        } else {
            System.out.println("The player was defeated!");
        }
    }
    public static int attackEnemy(int enemyHealth, int damage) {
        System.out.println("Player attacks the enemy, dealing " + damage + " damage.");
        enemyHealth -= damage;
        System.out.println("Enemy's current health: " + enemyHealth);
        return enemyHealth;
    }
    public static int attackEnemy(int enemyHealth, String specialMove) {
        System.out.println("Player uses a special move: " + specialMove + "!");
        int damage = 5;
        enemyHealth -= damage;
        System.out.println("Special move deals " + damage + " damage.");
        System.out.println("Enemy's current health: " + enemyHealth);
        return enemyHealth;
    }
    public static void collectItem(boolean itemCollected) {
        if (itemCollected) {
            updateScore(false, true);
            System.out.println("Player collected an item!");
            System.out.println("Player's current score: " + playerScore);
        }
    }
    public static void updateScore(boolean enemyDefeated, boolean itemCollected) {
        if (enemyDefeated) {
            playerScore += 50;  
            System.out.println("Player defeated an enemy! Score increased by 50.");
        }
        if (itemCollected) {
            playerScore += 10; 
            System.out.println("Player collected an item! Score increased by 10.");
        }
    }
    public static int getPlayerAction() {
        System.out.println("Choose an action: 1 (Regular Attack), 2 (Special Move): ");
        return 1;  
    }
}
