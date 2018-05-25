package com.blackbeltlabs.madcow;

import java.util.Arrays;
import java.util.List;

public class DayB implements Day {

    @Override
    public List<ExerciseType> getExerciseTypes() {
        return Arrays.asList(ExerciseType.SQUAT, ExerciseType.PRESS, ExerciseType.DEADLIFT);
    }
}
