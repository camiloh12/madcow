package com.blackbeltlabs.madcow;

import java.util.Arrays;
import java.util.List;

public class DayA extends Day {

    @Override
    public List<String> getExerciseTypes() {
        return Arrays.asList("SQUAT", "BENCH", "ROW");
    }
}
