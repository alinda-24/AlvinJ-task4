public class PrimeFinder {

    public void findPrimes(int max) {
        int number = 2; // The first prime number
        while (number < max) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            number++;
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void printNumberPyramid(int height) {
        for (int i = 1; i <= height; i++) {
            // Print leading spaces
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }
            // Print the first half of the row including the middle
            for (int j = 0; j < i; j++) {
                System.out.print(i + j);
            }
            // Print the second half of the row
            for (int j = i - 2; j >= 0; j--) {
                System.out.print(i + j);
            }
            System.out.println();
        }
    }

    public void printFibonacci(int n) {
        if (n <= 0) return;

        int a = 0, b = 1;
        System.out.print(a);
        for (int i = 1; i < n; i++) {
            System.out.print(", " + b);
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public void printFibonacciUpTo(int maxValue) {
        if (maxValue < 0) return;

        int a = 0, b = 1;
        System.out.print(a);
        while (b <= maxValue) {
            System.out.print(", " + b);
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PrimeFinder finder = new PrimeFinder();

        System.out.println("Primes less than 10:");
        finder.findPrimes(10);

        System.out.println("\nPyramid of height 4:");
        finder.printNumberPyramid(4);

        System.out.println("\nFirst 5 Fibonacci numbers:");
        finder.printFibonacci(5);

        System.out.println("\nFibonacci numbers up to 10:");
        finder.printFibonacciUpTo(10);
    }
}