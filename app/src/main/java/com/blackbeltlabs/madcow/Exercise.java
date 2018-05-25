package com.blackbeltlabs.madcow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class Exercise {

    private final List<BigDecimal> set = new ArrayList<>();
    private final ExerciseType type;

    Exercise(ExerciseType type, Calculation calculation, BigDecimal lastSetWeight) {
        this.type = type;
        for (int i = 4; i >= 1; i--) {
            BigDecimal multiplicand = BigDecimal.ONE.subtract(new BigDecimal("0.125").multiply(new BigDecimal(i)));
            BigDecimal setWeight = lastSetWeight.multiply(multiplicand);
            set.add(calculation.roundToSmallestPlate(new BigDecimal("2.5"), setWeight));
        }
        set.add(4, lastSetWeight);
    }

    BigDecimal getSet(int i) {
        return set.get(i-1);
    }

    public ExerciseType getType() {
        return type;
    }
}
