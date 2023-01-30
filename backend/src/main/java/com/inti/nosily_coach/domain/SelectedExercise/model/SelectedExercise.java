package com.inti.nosily_coach.domain.SelectedExercise.model;

import com.inti.nosily_coach.domain.Exercise.model.Exercise;
import com.inti.nosily_coach.domain.ExerciseRecord.model.ExerciseRecord;
import com.inti.nosily_coach.domain.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class SelectedExercise extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "record_id")
    private ExerciseRecord exerciseRecord;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;

    @Builder(access = AccessLevel.PRIVATE)
    private SelectedExercise(ExerciseRecord exerciseRecord, Exercise exercise) {
        this.exerciseRecord = exerciseRecord;
        this.exercise = exercise;
    }

    public static SelectedExercise newSelectedExercise(ExerciseRecord exerciseRecord, Exercise exercise) {
        return SelectedExercise.builder()
                .exerciseRecord(exerciseRecord)
                .exercise(exercise)
                .build();
    }
}
