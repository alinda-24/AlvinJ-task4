# 🎯 Advanced Loops and Conditionals in Java

One of the true strengths of computers lies in their ability to perform repetitive tasks efficiently. This week, we'll explore advanced aspects of Java's looping constructs, delve deeper into boolean expressions and operators, and harness the power of function overloading—all while using JShell for quick testing and experimentation.

## 📝 Preparation

- Review the [lecture slides](https://docs.oracle.com/en/java/javase/17/docs/api/index.html).
- Read and answer all questions in:
  - [Advanced Looping Techniques](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/loops.html)
  - [Java Boolean Expressions](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)

## ✅ Learning Goals

By the end of this module, you should be able to:
- Construct and evaluate complex boolean expressions using logical operators.
- Implement both `while` and `for` loops effectively.
- Use JShell to prototype and test Java code seamlessly.
- Utilize function overloading to handle different parameter lists efficiently.

## 🚨 Troubleshooting Guide

If you encounter any issues during the exercises:
1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues) to see if others have similar problems.
2. If needed, create a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new) with a descriptive title: "Task _x_: _summary of problem_"
3. Attend the [weekly lab](https://queue.csc.kth.se/Queue/INDA) for personalized help from a TA.

Engage with your peers constructively while maintaining academic integrity. Seek to understand AI explanations, but submit only your original work.

## 🏛 Assignment

We will explore multiple looping constructs and understand decision-making using boolean logic in various contexts this week.

### 📚 Boolean Expressions and Functionality

Our first goal is to deepen our understanding of boolean values and expressions. We will explore how these can be used as decision points in looping structures.

<details>
<summary> 📒 Topics Overview: Boolean Values, Expressions, and Operators </summary>

A [boolean value](https://en.wikipedia.org/wiki/Boolean_data_type) represents true or false states. A [boolean expression](https://en.wikipedia.org/wiki/Boolean_expression) evaluates to true or false depending on the conditions. Recall that Java's boolean operators are:
- `&&` (and)
- `||` (or)
- `!` (not)

Explore these operators in JShell to see how they alter expressions.

```java
jshell> boolean a = (5 > 3) && (2 < 4)
a ==> true

jshell> boolean b = !(7 == 5)
b ==> true
```

Use parentheses to affect operation precedence, similar to arithmetic expressions.

</details>

### 🚀 Task 1: Exploring and Evaluating Boolean Expressions

**Exercise 5.1.1 (docs) -- Evaluate complex boolean expressions**

Refer to `docs/README.md` to complete the table where you evaluate each expression:

| Boolean expression         | Value   |
| -------------------------- | ------- |
| `(4 > 5) || (3 == 3)`      |         |
| `!(10 <= 10) && (1 != 1)`  |         |
| `!(true && false) || true` |         |

> **Assistant's tip:** Use JShell to evaluate expressions quickly and understand how operators interact.

### 🔍 Task 2: Implementing Loop Constructs

Begin by jumping into practical implementation of `while` and `for` loops. We'll create methods demonstrating their versatility.

**Exercise 5.2.1 -- Implementing a `while` loop**

Create a Java file named `LoopingDemo.java`. Inside, write a method to use a `while` loop to display all prime numbers between 1 and 100.

```java
public static void printPrimesWhile() {
    int num = 2;
    while (num <= 100) {
        if (isPrime(num)) {
            System.out.println(num);
        }
        num++;
    }
}

public static boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return false;
    }
    return true;
}
```

**Exercise 5.2.2 -- Summing numbers with a `for` loop**

Add another method that sums all even numbers from 1 to 50 using a `for` loop.

```java
public static int sumEvenNumbers() {
    int sum = 0;
    for (int i = 2; i <= 50; i += 2) {
        sum += i;
    }
    return sum;
}
```

### 🔄 Task 3: Experimenting with Function Overloading

Function overloading enhances code flexibility by allowing multiple methods with the same name but different parameters.

**Exercise 5.3.1 -- Overloaded methods**

In your `LoopingDemo.java` file, create overloaded methods to calculate powers:

```java
public static long power(int base, int exp) {
    long result = 1;
    for (int i = 1; i <= exp; i++) {
        result *= base;
    }
    return result;
}

public static double power(double base, int exp) {
    double result = 1.0;
    for (int i = 1; i <= exp; i++) {
        result *= base;
    }
    return result;
}
```

Explore calling these methods from JShell for real-time results like `power(5, 3)` and `power(2.5, 2)`.

### 💡 Extra Credit: Function Overloading with Varied Return Types

Create an overloaded `calculateFactorial` method where one version returns an `int` and another rounds or truncates to return a `double` when needed.

### 🌐 Using JShell

For all tasks, repeatedly use JShell to test and tweak your methods interactively. This not only aids in checking correctness but also provides immediate feedback, enhancing your learning experience.

---

Implement these exercises thoughtfully, grasp the nuances of each concept, and soon you'll leverage them for powerful, efficient Java programming! Happy coding! 🎉