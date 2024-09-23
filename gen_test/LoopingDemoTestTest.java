package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class LoopingDemoTest {

    LoopingDemo loopingDemo;

    @Before
    public void setUp() {
        loopingDemo = new LoopingDemo();
    }

    @Test
    public void testIsPrime() {
        assertFalse(loopingDemo.isPrime(0));
        assertFalse(loopingDemo.isPrime(1));
        assertTrue(loopingDemo.isPrime(2));
        assertTrue(loopingDemo.isPrime(3));
        assertFalse(loopingDemo.isPrime(4));
        assertTrue(loopingDemo.isPrime(5));
        for (int i = 6; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            assertEquals(isPrime, loopingDemo.isPrime(i));
        }
    }

    @Test
    public void testSumEvenNumbers() {
        assertEquals(650, loopingDemo.sumEvenNumbers());
    }

    @Test
    public void testPowerInt() {
        assertEquals(1, loopingDemo.power(5, 0));
        assertEquals(5, loopingDemo.power(5, 1));
        assertEquals(25, loopingDemo.power(5, 2));
        assertEquals(125, loopingDemo.power(5, 3));
        assertEquals(1024, loopingDemo.power(2, 10));
        assertEquals(1, loopingDemo.power(10, 0)); // Boundary condition
    }

    @Test
    public void testPowerDouble() {
        assertEquals(1.0, loopingDemo.power(2.5, 0), 1e-9);
        assertEquals(2.5, loopingDemo.power(2.5, 1), 1e-9);
        assertEquals(6.25, loopingDemo.power(2.5, 2), 1e-9);
        assertEquals(15.625, loopingDemo.power(2.5, 3), 1e-9);
        assertEquals(64.0, loopingDemo.power(4.0, 3), 1e-9);
    }

    @Test
    public void testPrintPrimesWhile() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        loopingDemo.printPrimesWhile();

        String output = out.toString();
        String[] primes = { "2", "3", "5", "7", "11", "13", "17", "19", "23", "29", 
                            "31", "37", "41", "43", "47", "53", "59", "61", "67", 
                            "71", "73", "79", "83", "89", "97" };
        for (String prime : primes) {
            assertTrue(output.contains(prime));
        }
        System.setOut(System.out);
    }
}

