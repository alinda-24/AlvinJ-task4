package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class Loops {

    public void multiplesOfSeven() {
        int multipleOfSeven = 0;
        while (multipleOfSeven <= 100) {
            System.out.println(multipleOfSeven);
            multipleOfSeven += 7;
        }
    }

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