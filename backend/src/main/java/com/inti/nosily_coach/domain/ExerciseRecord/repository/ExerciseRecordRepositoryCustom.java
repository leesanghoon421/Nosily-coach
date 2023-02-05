package com.inti.nosily_coach.domain.ExerciseRecord.repository;

import com.inti.nosily_coach.domain.ExerciseRecord.model.ExerciseRecord;

import java.time.LocalDate;

public interface ExerciseRecordRepositoryCustom {
    ExerciseRecord findExerciseRecordByRecordId(Long memberId, Long recordId);
    Long getNumOfTodayRecord(Long memberId, LocalDate date);
}
