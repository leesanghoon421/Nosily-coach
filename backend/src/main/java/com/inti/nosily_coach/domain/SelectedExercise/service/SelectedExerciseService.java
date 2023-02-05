package com.inti.nosily_coach.domain.SelectedExercise.service;

import com.inti.nosily_coach.domain.Exercise.model.Exercise;
import com.inti.nosily_coach.domain.ExerciseRecord.model.ExerciseRecord;
import com.inti.nosily_coach.domain.SelectedExercise.model.SelectedExercise;

import java.time.LocalTime;

public interface SelectedExerciseService {
    void createSelectedExercise(Exercise exercise, ExerciseRecord exerciseRecord, LocalTime times, int counts, int setCnt);
    void updateSelectedExercise(SelectedExercise selectedExercise, LocalTime times, int counts, int setCnt);
    void deleteSelectedExercise(SelectedExercise selectedExercise);
}
