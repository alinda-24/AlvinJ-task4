public class Loops {

    /**
     * Print all multiples of seven between 0 and 100
     */
    public void multiplesOfSeven() {
        int multipleOfSeven = 0;
        while (multipleOfSeven <= 100) {
            System.out.println(multipleOfSeven);
            multipleOfSeven += 7;
        }
    }

    /**
     * Sum integers between 0 and an upper bound
     * @param max the value to sum up to (inclusive)
     * @return the sum of all integers between 0 and the maximum
     */
    public int sumUpTo(int max) {
        if (max < 0) {
            return 0;
        }
        int sum = 0;
        int i = 0;
        while (i <= max) {
            sum += i;
            i++;
        }
        return sum;
    }

    /**
     * Sum a range of integers
     * @param min the value to start the sum at (inclusive)
     * @param max the value to end the sum at (inclusive)
     * @return the sum of all integers in the range min-max
     */
    public int sumBetween(int min, int max) {
        if (min > max) {
            return 0;
        }
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Count numbers divisible by a given number up to 100
     * @param num the divisor
     * @return the count of numbers from 1 to 100 divisible by num
     */
    public int countDivisibles(int num) {
        if (num == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % num == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Count numbers divisible by a given divisor up to a specified number
     * @param num the upper bound (inclusive)
     * @param divisor the divisor
     * @return the count of numbers from 1 to num divisible by divisor
     */
    public int countDivisibles(int num, int divisor) {
        if (divisor == 0 || num < 1) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (i % divisor == 0) {
                count++;
            }
        }
        return count;
    }
}