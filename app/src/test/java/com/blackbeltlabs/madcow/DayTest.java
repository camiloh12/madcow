package com.blackbeltlabs.madcow;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DayTest {

    @Test
    public void testDayA() {
        Day day = new DayA();
        assertTrue(day.getExerciseTypes().contains(ExerciseType.SQUAT));
        assertTrue(day.getExerciseTypes().contains(ExerciseType.BENCH));
        assertTrue(day.getExerciseTypes().contains(ExerciseType.ROW));
    }

    @Test
    public void testDayB() {
        Day day = new DayB();
        assertTrue(day.getExerciseTypes().contains(ExerciseType.SQUAT));
        assertTrue(day.getExerciseTypes().contains(ExerciseType.PRESS));
        assertTrue(day.getExerciseTypes().contains(ExerciseType.DEADLIFT));
    }

    @Test
    public void testDayC() {
        Day day = new DayC();
        assertTrue(day.getExerciseTypes().contains(ExerciseType.SQUAT));
        assertTrue(day.getExerciseTypes().contains(ExerciseType.BENCH));
        assertTrue(day.getExerciseTypes().contains(ExerciseType.ROW));
    }
}
