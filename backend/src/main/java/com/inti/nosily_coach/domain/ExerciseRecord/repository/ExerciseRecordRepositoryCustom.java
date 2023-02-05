package com.inti.nosily_coach.domain.ExerciseRecord.repository;

import com.inti.nosily_coach.domain.ExerciseRecord.model.ExerciseRecord;

public interface ExerciseRecordRepositoryCustom {
    ExerciseRecord findExerciseRecordByRecordId(Long memberId, Long recordId);
}
