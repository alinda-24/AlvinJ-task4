# 🚀 Exploring Loops and Boolean Logic in Java

A core strength of computers is their ability to repeatedly perform tasks accurately and efficiently. If tasked to count to 10,000, a human may become prone to errors or fatigue. A computer, however, will execute the operation flawlessly every time. This concept of repetition in programming is known as _iteration_ or _looping_. This assignment will guide you through these foundational programming concepts in Java.

### 📝 Preparation

Before diving into the exercises, ensure you're equipped with the necessary knowledge:

- Review the [lecture slides on loops](https://docs.google.com/presentation/d/1kcsmcuBBu4Jr3O_r6eNP6IFrP6DEITDWeRS5_7rtV30/edit#slide=id.p).
- Read and reflect on the following modules:
  - [Module 5: Looping with for-each](https://qbl.sys.kth.se/sections/dd1337_programming/page/looping_with_foreach)
  - [Module 6: Iteration](https://qbl.sys.kth.se/sections/dd1337_programming/page/iteration__continued)

### ✅ Learning Goals

By the end of this assignment, you should be able to:

- Understand and use `boolean` expressions and operators.
- Implement `while` loops effectively.
- Utilize `for` loops in various scenarios.
- Experiment with your Java programs using JShell.
- Recognize and apply function overloading.

### 🚨 Troubleshooting Guide

If you encounter any issues, follow these steps:

1. Check if others are facing similar issues by looking at [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues).
2. If not, create a [new issue](https://gits-15.sys.kth.se/inda-24/help/issues/new) with a descriptive title like "Task _x_: _Problem Summary_".
3. Seek assistance from a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA).

Remember to collaborate with peers for understanding but refrain from sharing answers or using unauthorized AI-generated solutions. You should be able to explain your code under examination conditions.

### 🏛 Assignment Overview

To program effective loops, clarity on when to terminate a loop is essential. This is often guided by specific conditions, typically represented by _boolean expressions_.

<details>
<summary> 📚 Boolean Values, Expressions, and Operators </summary>

A [boolean value](https://en.wikipedia.org/wiki/Boolean_data_type) is either `true` or `false`. Similarly, a [boolean expression](https://en.wikipedia.org/wiki/Boolean_expression) evaluates to `true` or `false`, like stating "The capital of Mozambique is Maputo."

Java supports this concept with the `boolean` type, having values `true` or `false`:
```java
boolean isMozambiqueCapitalMaputo = true;
boolean isTwoEqualFive = false;
```

Primary boolean operators:
- `&&` for "and"
- `||` for "or"
- `!` for "not"

Use parentheses to manage operator precedence, akin to arithmetic.
</details>

#### Exercise 1: Understanding Boolean Logic

Complete the table by determining the boolean value for each expression:

| Boolean expression | Value   |
| ------------------ | ------- |
| `2 == 5`           | `false` |
| `2 > 5`            |         |
| `11 == 11`         |         |
| `7 <= 9`           |         |
| `42 >= 7`          |         |
| `false == true`    |         |

#### Exercise 2: Exploring Boolean Operators

Analyze each expression and fill in the table with the respective boolean value:

| Expression        | Value |
| ----------------- | ----- |
| `2 == 3 && 2 == 2`  |       |
| `2 == 3 || 2 == 2`  |       |
| `!true`             |       |
| `!false`            |       |

> **Assistant's tip:** Use [JShell](https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm) for quick Java expression evaluations, like `2 == 5` to see it return `false`.

#### Exercise 3: The `while` Loop

Create a file `Loops.java` and add this method:

```java
public void multiplesOfSeven() {
  // Your code goes here
}
```

This method should print multiples of seven between 0 and 100 using a `while` loop.

<details>
<summary> 📚 The `while` Loop </summary>

A [while-loop](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html) is a fundamental loop type that continues as long as a condition remains true. Consider:

```java
int count = 0;
while (count < 5) {
    count += 1;
}
```

Determine the final value of `count` after the loop.
</details>

#### Exercise 4: Summation with `while`

In `Loops.java`, implement:

```java
public int sumUpTo(int max) {
  // Your code goes here
}
```

Use a `while` loop to sum integers from 0 to `max`, returning the total sum. If `max` is negative, return `0`.

#### Exercise 5: Summation with `for`

Add a method:

```java
public int sumBetween(int min, int max) {
  // Your code goes here
}
```

Using a `for` loop, compute and return the sum of integers between `min` and `max`. Return `0` if `min > max`.

<details>
<summary> 📚 The `for` Loop </summary>

The [for-loop](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html) combines variable declaration, condition checking, and iteration:

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```
</details>

#### Exercise 6: Function Overloading

Implement the following methods and explore how Java allows methods with the same name but different parameters:

- `public int countDivisibles(int num)`
- `public int countDivisibles(int num, int divisor)`

The first method should return the count of numbers from 1 to 100 divisible by `num`. The second should return numbers from 1 to `num` divisible by the `divisor`.

> **Assistant's note:** This is an example of [function overloading](https://en.wikipedia.org/wiki/Function_overloading). Java differentiates functions by parameter count or type.

By the end of these exercises, you should have a solid foundation in using loops, boolean expressions, and function overloading in Java, generating outputs to verify your understanding with JShell. Happy coding! 🚀