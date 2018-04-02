package com.blackbeltlabs.madcow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class Progression {

    private final List<BigDecimal> week = new ArrayList<>();

    Progression(Calculation calculation, BigDecimal startingWeight) {
        week.add(startingWeight);
        for (int i = 1; i < 12; i++) {
            BigDecimal progression = startingWeight.multiply(new BigDecimal("1.025").pow(i));
            week.add(calculation.roundToSmallestPlate(new BigDecimal("2.5"), progression));
        }
    }

    BigDecimal getWeek(int i) {
        return week.get(i-1);
    }
}
