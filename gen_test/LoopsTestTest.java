package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class LoopsTest {

    Loops loops;

    @Before
    public void setUp() {
        loops = new Loops();
    }

    @Test
    public void testSumUpToPositive() {
        assertEquals(5050, loops.sumUpTo(100));
    }

    @Test
    public void testSumUpToZero() {
        assertEquals(0, loops.sumUpTo(0));
    }

    @Test
    public void testSumUpToNegative() {
        assertEquals(0, loops.sumUpTo(-5));
    }

    @Test
    public void testSumBetweenValidRange() {
        assertEquals(33, loops.sumBetween(10, 12));
    }

    @Test
    public void testSumBetweenSingleValue() {
        assertEquals(12, loops.sumBetween(12, 12));
    }

    @Test
    public void testSumBetweenMinGreaterThanMax() {
        assertEquals(0, loops.sumBetween(12, 10));
    }

    @Test
    public void testCountDivisiblesValidNumber() {
        assertEquals(14, loops.countDivisibles(7));
    }

    @Test
    public void testCountDivisiblesZeroDivisor() {
        assertEquals(0, loops.countDivisibles(0));
    }
    
    @Test
    public void testCountDivisiblesExceedingRangeWithDivisor() {
        assertEquals(2, loops.countDivisibles(20, 10));
    }

    @Test
    public void testCountDivisiblesExceedingRangeWithZero() {
        assertEquals(0, loops.countDivisibles(20, 0));
    }
}

// Loops.java
