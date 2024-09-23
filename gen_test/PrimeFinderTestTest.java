package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class PrimeFinderTest {

    private PrimeFinder primeFinder;
    private ByteArrayOutputStream outputStream;

    @Before
    public void setUp() {
        primeFinder = new PrimeFinder();
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testFindPrimesWithValidMax() {
        primeFinder.findPrimes(10); // should print primes less than 10
        String expectedOutput = "2\n3\n5\n7\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testFindPrimesWithMaxTwo() {
        primeFinder.findPrimes(2); // should print nothing as no primes less than 2
        String expectedOutput = "";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testFindPrimesWithNegativeMax() {
        primeFinder.findPrimes(-1); // should print nothing as invalid input
        String expectedOutput = "";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testPrintNumberPyramidWithValidHeight() {
        primeFinder.printNumberPyramid(4);
        String expectedOutput = 
                "   1\n" +
                "  232\n" +
                " 34543\n" +
                "4567654\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testPrintNumberPyramidWithZeroHeight() {
        primeFinder.printNumberPyramid(0);
        String expectedOutput = "";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testPrintFibonacciWithValidInput() {
        primeFinder.printFibonacci(5);
        String expectedOutput = "0, 1, 1, 2, 3\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testPrintFibonacciWithInputZero() {
        primeFinder.printFibonacci(0); // valid logic, prints nothing
        String expectedOutput = "";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testPrintFibonacciUpToValue() {
        primeFinder.printFibonacciUpTo(10);
        String expectedOutput = "0, 1, 1, 2, 3, 5, 8\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testPrintFibonacciUpToNegativeValue() {
        primeFinder.printFibonacciUpTo(-5); // should print nothing
        String expectedOutput = "";
        assertEquals(expectedOutput, outputStream.toString());
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

