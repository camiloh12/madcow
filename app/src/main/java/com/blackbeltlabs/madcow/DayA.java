package com.blackbeltlabs.madcow;

import java.util.Arrays;
import java.util.List;

public class DayA implements Day {

    @Override
    public List<ExerciseType> getExerciseTypes() {
        return Arrays.asList(ExerciseType.SQUAT, ExerciseType.BENCH, ExerciseType.ROW);
    }
}
