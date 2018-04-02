package com.blackbeltlabs.madcow;

import java.math.BigDecimal;

class Calculation {

    private static final int PRECISION = 10;
    private static final int LIFTING_SCALE = 1;
    private static final int REP_MAX_SCALE = 0;
    private static final BigDecimal TWO_PLATES = new BigDecimal("2");

    BigDecimal startingWeight(SetUp setUp) {
        BigDecimal multiplier = BigDecimal.ONE.divide(new BigDecimal("1.025"), PRECISION, BigDecimal.ROUND_HALF_UP).pow(setUp.getPrWeek() -1);
        BigDecimal startingWeight = setUp.getFiveRepMax().multiply(multiplier);
        startingWeight = roundToSmallestPlate(setUp.getSmallestPlate(), startingWeight);
        return startingWeight;
    }

    BigDecimal oneRepMax(BigDecimal weight, BigDecimal reps) {
        BigDecimal repCoefficient = getRepCoefficient(reps);
        return weight.divide(repCoefficient, REP_MAX_SCALE, BigDecimal.ROUND_HALF_UP);
    }

    BigDecimal fiveRepMax(BigDecimal oneRepMax) {
        BigDecimal fiveReps = new BigDecimal("5");
        BigDecimal repCoefficient = getRepCoefficient(fiveReps);
        return oneRepMax.multiply(repCoefficient).setScale(REP_MAX_SCALE, BigDecimal.ROUND_HALF_UP);
    }

    BigDecimal roundToSmallestPlate(BigDecimal smallestPlate, BigDecimal startingWeight) {
        BigDecimal rounder = TWO_PLATES.multiply(smallestPlate);
        startingWeight = startingWeight.divide(rounder, 0, BigDecimal.ROUND_HALF_UP);
        startingWeight = startingWeight.multiply(rounder).setScale(LIFTING_SCALE, BigDecimal.ROUND_HALF_UP);
        return startingWeight;
    }

    private BigDecimal getRepCoefficient(BigDecimal reps) {
        return new BigDecimal("1.0278").subtract(reps.multiply(new BigDecimal("0.0278")));
    }
}
