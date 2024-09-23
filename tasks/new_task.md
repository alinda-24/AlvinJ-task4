# Mastering Java Loops and Booleans

Ever wonder how computers perform repetitive tasks tirelessly? It's their ability to execute operations repeatedly, a concept known as _iteration_ or _looping_. This week, we'll explore core Java concepts like `boolean` expressions, `while` and `for` loops, function overloading, and how to experiment with these concepts using JShell.

### 📝 Preparation

- Review this [Java Loops Overview](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html).
- Go through your notes on **boolean expressions** from past lectures.
- Familiarize yourself with the Java [tutorial on JShell](https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm).

### ✅ Learning Goals

This week's learning goals are:

- Understanding and using `boolean` expressions and operators effectively.
- Creating and using `while` loops.
- Implementing `for` loops to iterate over sequences.
- Experimenting with code using JShell.
- Applying function overloading in practical scenarios.

### 🚨 Troubleshooting Guide

If you encounter issues:

1. Visit the posted issues on [Discussion Board](https://gits-15.sys.kth.se/java-24/help/issues).
2. If your issue isn't covered, create a [New Issue](https://gits-15.sys.kth.se/java-24/help/issues/new). Include a clear title, e.g., "Task _x_: _issue summary_".
3. Ask your peers or an instructor during designated lab hours.

Discuss with classmates, but do not share solutions. While AI can help explain concepts, your solutions must be your own and understood thoroughly!

### 🏛 Assignment

This task helps you practice creating loops and using `boolean` expressions to control them, using JShell to ensure your code does what you expect, and exploring function overloading.

#### 1. Exploring Boolean Expressions

<details>
<summary> 📚 Boolean values, expressions, and operators </summary>

A [boolean value](https://en.wikipedia.org/wiki/Boolean_data_type) is either true or false. Boolean expressions evaluate conditions, resulting in a true or false value. In Java, `boolean` is a primitive type. Here are a few examples:

```java
boolean isRaining = false;
boolean isSunny = !isRaining;
```

Boolean operators include:
- `&&`: “and”
- `||`: “or”
- `!`: “not”

Parentheses can change the precedence of operations, similar to arithmetic expressions.

</details>

##### Exercise 1.1: Boolean Evaluations

In your notes, create a table with these boolean expressions and evaluate their truth value:

| Expression                 | Value   |
|----------------------------|---------|
| `(5 > 3) && (2 <= 2)`      | `true`  |
| `(5 == 8) || (3 > 1)`      |         |
| `!(false || true)`         |         |
| `true && !(false || false)`|         |

> **Tip:** Use JShell to quickly test these expressions. Simply start JShell in your terminal, enter these expressions, and see the results.

#### 2. While-Loops and Control

##### Exercise 2.1: Prime Numbers with While Loop

Create a Java class `PrimeFinder` with a method that printed all prime numbers less than a given number using a `while` loop. 

```java
public void findPrimes(int max)
```

> **Hint:** Remember that a prime number is only divisible by 1 and itself. Use a method to check for primality within the loop.

#### 3. For-Loops and Patterns

##### Exercise 3.1: Pyramid of Numbers

Add to `PrimeFinder` a method that prints a pyramid of numbers using a `for` loop.

```java
public void printNumberPyramid(int height)
```

For example, for `height = 4`, the output should be:
```
   1
  232
 34543
4567654
```

### 4. Using JShell and Function Overloading

##### Exercise 4.1: Fibonacci Series

Implement two overloaded versions of a method `printFibonacci`. The first takes an integer `n` and prints the first `n` numbers of the Fibonacci sequence; the second takes a maximum value and prints the Fibonacci sequence up to that number.

```java
public void printFibonacci(int n) // prints first n numbers
public void printFibonacciUpTo(int maxValue) // prints numbers up to maxValue
```

Use JShell to experiment with and ensure each method functions correctly.

### Final Note

Use this assignment to master loops and boolean logic in Java. Try breaking problems into smaller parts when you get stuck, and remember to test with JShell. Happy coding! 🚀