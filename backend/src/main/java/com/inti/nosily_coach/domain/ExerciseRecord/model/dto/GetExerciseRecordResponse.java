package com.inti.nosily_coach.domain.ExerciseRecord.model.dto;

import com.inti.nosily_coach.domain.SelectedExercise.model.SelectedExercise;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class GetExerciseRecordResponse {
    private Long recordId;
    private List<SelectedExercise> selectedExercises;
    private String memo;
    private String createdAt;

    public static GetExerciseRecordResponse of(Long recordId, List<SelectedExercise> selectedExercises,
                                               String memo, String createdAt) {
        return new GetExerciseRecordResponse(recordId, selectedExercises, memo, createdAt);
    }
}
