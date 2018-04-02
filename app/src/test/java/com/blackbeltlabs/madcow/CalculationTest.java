package com.blackbeltlabs.madcow;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CalculationTest {

    private Calculation testObject = new Calculation();

    @Test
    public void startingWeightPrWeek5() {
        BigDecimal expectedStartingWeight = new BigDecimal("177.5");
        int prWeek = 5;
        BigDecimal smallestPlate = new BigDecimal("1.25");

        BigDecimal fiveRepMax = new BigDecimal("195");
        BigDecimal result = testObject.startingWeight(new SetUp(fiveRepMax, prWeek, smallestPlate));
        assertEquals(expectedStartingWeight, result);
    }

    @Test
    public void startingWeightPrWeek4() {
        BigDecimal expectedStartingWeight = new BigDecimal("160.0");
        int prWeek = 4;
        BigDecimal smallestPlate = new BigDecimal("1.25");

        BigDecimal fiveRepMax = new BigDecimal("173");
        BigDecimal result = testObject.startingWeight(new SetUp(fiveRepMax, prWeek, smallestPlate));
        assertEquals(expectedStartingWeight, result);
    }

    @Test
    public void startingWeightSmallestPlate25() {
        BigDecimal expectedStartingWeight = new BigDecimal("135.0");
        int prWeek = 4;
        BigDecimal smallestPlate = new BigDecimal("2.5");

        BigDecimal fiveRepMax = new BigDecimal("148");
        BigDecimal result = testObject.startingWeight(new SetUp(fiveRepMax, prWeek, smallestPlate));
        assertEquals(expectedStartingWeight, result);
    }

    @Test
    public void oneRepMax() {
        BigDecimal weight = new BigDecimal("195");
        BigDecimal reps = new BigDecimal("5");
        BigDecimal result = testObject.oneRepMax(weight, reps);

        assertEquals(new BigDecimal("219"), result);
    }

    @Test
    public void fiveRepMax() {
        BigDecimal oneRepMax = new BigDecimal("219");

        BigDecimal result = testObject.fiveRepMax(oneRepMax);

        assertEquals(new BigDecimal("195"), result);
    }
}
