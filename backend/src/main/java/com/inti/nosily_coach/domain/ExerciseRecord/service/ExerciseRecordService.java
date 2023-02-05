package com.inti.nosily_coach.domain.ExerciseRecord.service;

import com.inti.nosily_coach.domain.ExerciseRecord.model.dto.CreateExerciseRecordRequest;
import com.inti.nosily_coach.domain.ExerciseRecord.model.dto.CreateExerciseRecordResponse;

public interface ExerciseRecordService {
    CreateExerciseRecordResponse createExerciseRecord(Long memberId, CreateExerciseRecordRequest request);
}
