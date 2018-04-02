package com.blackbeltlabs.madcow;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ProgressionTest {

    private Progression testObject;

    @Before
    public void setUp() {
        Calculation calculation = new Calculation();
        BigDecimal startingWeight = new BigDecimal("175");
        testObject = new Progression(calculation, startingWeight);
    }

    @Test
    public void testProgression() {
        assertEquals(new BigDecimal("175"), testObject.getWeek(1));
        assertEquals(new BigDecimal("180.0"), testObject.getWeek(2));
        assertEquals(new BigDecimal("185.0"), testObject.getWeek(3));
        assertEquals(new BigDecimal("190.0"), testObject.getWeek(4));
        assertEquals(new BigDecimal("195.0"), testObject.getWeek(5));
        assertEquals(new BigDecimal("200.0"), testObject.getWeek(6));
        assertEquals(new BigDecimal("205.0"), testObject.getWeek(7));
        assertEquals(new BigDecimal("210.0"), testObject.getWeek(8));
        assertEquals(new BigDecimal("215.0"), testObject.getWeek(9));
        assertEquals(new BigDecimal("220.0"), testObject.getWeek(10));
        assertEquals(new BigDecimal("225.0"), testObject.getWeek(11));
        assertEquals(new BigDecimal("230.0"), testObject.getWeek(12));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowIndexException() {
        testObject.getWeek(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowIndexExceptionUpperBound() {
        testObject.getWeek(13);
    }
}
