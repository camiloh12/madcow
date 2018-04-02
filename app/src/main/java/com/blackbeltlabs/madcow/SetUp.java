package com.blackbeltlabs.madcow;

import java.math.BigDecimal;

public class SetUp {
    private final BigDecimal fiveRepMax;
    private final int prWeek;
    private final BigDecimal smallestPlate;

    public SetUp(BigDecimal fiveRepMax, int prWeek, BigDecimal smallestPlate) {
        this.fiveRepMax = fiveRepMax;
        this.prWeek = prWeek;
        this.smallestPlate = smallestPlate;
    }

    public BigDecimal getFiveRepMax() {
        return fiveRepMax;
    }

    public int getPrWeek() {
        return prWeek;
    }

    public BigDecimal getSmallestPlate() {
        return smallestPlate;
    }
}
