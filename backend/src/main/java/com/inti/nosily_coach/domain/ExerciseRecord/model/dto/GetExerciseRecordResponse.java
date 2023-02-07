package com.inti.nosily_coach.domain.ExerciseRecord.model.dto;

import com.inti.nosily_coach.domain.SelectedExercise.model.dto.GetSelectedExerciseResponse;
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
    private List<GetSelectedExerciseResponse> selectedExercises;
    private String memo;
    private String createdAt;
    private String totalTime;

    public static GetExerciseRecordResponse of(Long recordId, List<GetSelectedExerciseResponse> selectedExercises,
                                               String memo, String createdAt, String totalTime) {
        return new GetExerciseRecordResponse(recordId, selectedExercises, memo, createdAt, totalTime);
    }
}
