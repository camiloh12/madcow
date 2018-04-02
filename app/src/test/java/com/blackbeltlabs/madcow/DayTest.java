package com.blackbeltlabs.madcow;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DayTest {

    @Test
    public void testDayA() {
        Day day = new DayA();
        assertTrue(day.getExerciseTypes().contains("SQUAT"));
        assertTrue(day.getExerciseTypes().contains("BENCH"));
        assertTrue(day.getExerciseTypes().contains("ROW"));
    }

    @Test
    public void testDayB() {
        Day day = new DayB();
        assertTrue(day.getExerciseTypes().contains("SQUAT"));
        assertTrue(day.getExerciseTypes().contains("PRESS"));
        assertTrue(day.getExerciseTypes().contains("DEADLIFT"));
    }

    @Test
    public void testDayC() {
        Day day = new DayC();
        assertTrue(day.getExerciseTypes().contains("SQUAT"));
        assertTrue(day.getExerciseTypes().contains("BENCH"));
        assertTrue(day.getExerciseTypes().contains("ROW"));
    }
}
