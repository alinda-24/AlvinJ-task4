public class LoopingDemo {

    public static void main(String[] args) {
        printPrimesWhile();
        System.out.println("Sum of even numbers from 1 to 50: " + sumEvenNumbers());
        System.out.println("Power of 5^3: " + power(5, 3));
        System.out.println("Power of 2.5^2: " + power(2.5, 2));
    }

    /**
     * Prints all prime numbers between 1 and 100 using a while loop.
     */
    public static void printPrimesWhile() {
        int num = 2;
        while (num <= 100) {
            if (isPrime(num)) {
                System.out.println(num);
            }
            num++;
        }
    }

    /**
     * Checks if a number is prime.
     * 
     * @param n the number to check for primality.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    /**
     * Sums all even numbers from 1 to 50 using a for loop.
     * 
     * @return the sum of all even numbers from 1 to 50.
     */
    public static int sumEvenNumbers() {
        int sum = 0;
        for (int i = 2; i <= 50; i += 2) {
            sum += i;
        }
        return sum;
    }

    /**
     * Calculates the power of an integer base raised to an integer exponent.
     * 
     * @param base the base number.
     * @param exp the exponent.
     * @return the result of base raised to the power of exp.
     */
    public static long power(int base, int exp) {
        long result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    /**
     * Calculates the power of a double base raised to an integer exponent.
     * 
     * @param base the base number.
     * @param exp the exponent.
     * @return the result of base raised to the power of exp.
     */
    public static double power(double base, int exp) {
        double result = 1.0;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }
}