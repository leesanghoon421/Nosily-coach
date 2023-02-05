package com.inti.nosily_coach.domain.ExerciseRecord.controller;

import com.inti.nosily_coach.domain.ExerciseRecord.model.dto.CreateExerciseRecordRequest;
import com.inti.nosily_coach.domain.ExerciseRecord.model.dto.CreateExerciseRecordResponse;
import com.inti.nosily_coach.domain.ExerciseRecord.model.dto.UpdateExerciseRecordResponse;
import com.inti.nosily_coach.domain.ExerciseRecord.service.ExerciseRecordService;
import com.inti.nosily_coach.domain.common.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ExerciseRecordController {
    private final ExerciseRecordService exerciseRecordService;

    // # 운동 기록 작성
    @PostMapping("/api/exerciseRecords")
    public ApiResponse<CreateExerciseRecordResponse> createExerciseRecord(
            Long memberId, @RequestPart CreateExerciseRecordRequest createExerciseRecordRequest) {
        CreateExerciseRecordResponse response = exerciseRecordService.createExerciseRecord(memberId, createExerciseRecordRequest);

        return ApiResponse.success(response);
    }

    // # 운동 기록 수정
    @PatchMapping("/api/exerciseRecords/{recordId}")
    public ApiResponse<UpdateExerciseRecordResponse> updateExerciseRecord(
            Long memberId, @PathVariable("recordId") Long recordId, String memo) {
        UpdateExerciseRecordResponse response = exerciseRecordService.updateExerciseRecord(memberId, recordId, memo);

        return ApiResponse.success(response);
    }

    // # 운동 기록 전체 조회
    // # 운동 기록 날짜별 조회
}
