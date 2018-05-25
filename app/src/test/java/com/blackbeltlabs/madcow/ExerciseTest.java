package com.blackbeltlabs.madcow;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ExerciseTest {

    @Test
    public void testSets() {
        Calculation calculation = new Calculation();
        BigDecimal lastSetWeight = new BigDecimal("175.0");
        Exercise exercise = new Exercise(ExerciseType.SQUAT, calculation, lastSetWeight);

        assertEquals(ExerciseType.SQUAT, exercise.getType());
        assertEquals(new BigDecimal("90.0"), exercise.getSet(1));
        assertEquals(new BigDecimal("110.0"), exercise.getSet(2));
        assertEquals(new BigDecimal("130.0"), exercise.getSet(3));
        assertEquals(new BigDecimal("155.0"), exercise.getSet(4));
        assertEquals(new BigDecimal("175.0"), exercise.getSet(5));
    }
}
