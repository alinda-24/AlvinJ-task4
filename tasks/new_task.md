# Java Game Development

Creating a game application involves combining various programming concepts to simulate player interactions, scoring, and the presence of enemies. This assignment focuses on using these concepts: `boolean` expressions and operators, `while` loops, `for` loops, using JShell, and function overloading in Java.

### 📝 Preparation

- Go through the [Java Programming and Game Design](https://java-game-dev-course.com) lectures.
- Familiarize yourself with concepts in:
  - [Module: Game Loops](https://java-game-dev-course.com/modules/game-loops)
  - [Module: Player Interactions](https://java-game-dev-course.com/modules/player-interaction)

### ✅ Learning Goals

This week's learning goals include:

* `boolean` expressions and operators
* `while` loops
* `for` loops
* Using JShell to try your Java program
* Function overloading

### 🚨 Troubleshooting Guide

If you encounter any issues during this assignment:

1. Check the [troubleshooting forum](https://java-game-dev-course.com/help-forum) for similar queries.
2. If your question isn't posted, create a [new issue](https://java-game-dev-course.com/help-forum/new-issue) summarizing your problem.
3. Attend the [online tutoring sessions](https://java-game-dev-course.com/labs) for direct assistance.

Engage with your classmates for discussions, but refrain from sharing code directly. If using AI tools for help, ensure that the final solution reflects your understanding and is uniquely yours.

### 🎯 Assignment: Build a Simple Game Application

Your task is to create a simple game with the following features: player movement, a scoring system, and enemy interactions.

#### Step 1: Understanding Boolean Logic

Understanding when to stop a loop or decide on actions within the game is crucial. Boolean expressions are at the core of these decisions.

<details>
<summary> 📚 Boolean values, expressions, and operators </summary>

A [boolean value](https://en.wikipedia.org/wiki/Boolean_data_type) is either `true` or `false`. A [boolean expression](https://en.wikipedia.org/wiki/Boolean_expression) evaluates to these values.
```java
boolean isPlayerAlive = true;
boolean enemyNearby = false;
```

Three essential boolean operators in Java are `&&` (Logical AND), `||` (Logical OR), and `!` (Logical NOT).
```java
if (isPlayerAlive && enemyNearby) {
    System.out.println("Prepare for battle!");
}
```
Use parentheses to clarify the order of operations in complex expressions, similar to arithmetic operations.
</details>

#### Exercise 1.1 -- Boolean Logic Practice

Evaluate these boolean expressions and determine the value:

| Expression            | Value   |
|-----------------------|---------|
| `10 > 5 && 10 < 15`   |         |
| `5 == 5 || 5 < 5`     |         |
| `!(false && true)`    |         |
| `true || (false && true)` |    |

Test your evaluations with JShell for immediate feedback.

#### Step 2: Implementing Basic Game Loop

The game loop is the core structure that keeps the game running by repeatedly checking for updates, player inputs, and rendering visuals.

<details>
<summary> 📚 The while loop </summary>

The [while-loop](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html) continuously executes a block of code while a condition is true.
```java
boolean gameRunning = true;
while (gameRunning) {
    // Game logic here
    if (playerHealth <= 0) {
        gameRunning = false;
    }
}
```
</details>

#### Exercise 2.1 -- Setting Up Your Game Loop

Create a class `SimpleGame` with a `main` method. Use a `while` loop to create a game loop that checks for player health and ends the game if health declines to 0 or lower.

#### Step 3: Player Movement and Scoring

<details>
<summary> 📚 The for loop </summary>

A [for-loop](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html) is ideal for iterating over a range of values.
```java
for (int score = 0; score <= 100; score += 10) {
    System.out.println("Current Score: " + score);
}
```
</details>

#### Exercise 3.1 -- Implement Player Movement

Add a method `movePlayer` that uses a for-loop for movement in a simplistic axis system (e.g., x, y coordinates). Decrease the player's score for every move.

#### Exercise 3.2 -- Scoring System

Create a method that updates and displays the player's score based on actions like defeating enemies or collecting items. Use a `boolean` to check if an item is collected or an enemy is defeated for score modifications.

#### Step 4: Enemy Interactions and Challenges

Use function overloading to simulate different encounters with enemies. Overload methods to handle varied interactions (e.g., `attackEnemy(int damage)` and `attackEnemy(String specialMove)`).

#### Exercise 4.1 -- Handle Enemy Interactions

1. Implement methods for different types of enemy interactions using function overloading.
2. Utilize `while` loops to handle continuous interactions until a condition is met (like enemy health reaching zero).

#### Step 5: Testing and JShell

Integrate all parts and validate your game logic using JShell for testing individual functions or scenarios without building the entire project every time.

```bash
# Example JShell session
jshell SimpleGame.java
SimpleGame.movePlayer();
```

Focus on creating a seamless experience integrating all the learned concepts. Remember, the key to successful game development is continuous testing and iterations. Happy coding! 🚀