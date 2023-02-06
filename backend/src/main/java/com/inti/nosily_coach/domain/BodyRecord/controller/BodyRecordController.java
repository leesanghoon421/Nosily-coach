package com.inti.nosily_coach.domain.BodyRecord.controller;

import com.inti.nosily_coach.domain.BodyRecord.model.dto.GetBodyRecordsResponse;
import com.inti.nosily_coach.domain.BodyRecord.service.BodyRecordService;
import com.inti.nosily_coach.domain.common.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class BodyRecordController {
    private final BodyRecordService bodyRecordService;

    // # 몸기록 작성

    // # 몸기록 전체 조회
    @GetMapping("/api/bodyRecords")
    public ApiResponse<List<GetBodyRecordsResponse>> getAllBodyRecords(Long memberId, @PageableDefault(size = 5)Pageable pageable) {
        List<GetBodyRecordsResponse> getBodyRecordsResponses = bodyRecordService.getAllBodyRecords(memberId, pageable);
        return ApiResponse.success(getBodyRecordsResponses);
    }

    // # 몸기록 날짜별 조회
    @GetMapping("/api/bodyRecords/date")
    public ApiResponse<GetBodyRecordsResponse> getBodyRecordByDate(Long memberId, @RequestParam LocalDate localDate) {
        GetBodyRecordsResponse getBodyRecordsResponse = bodyRecordService.getBodyRecordByDate(memberId, localDate);
        return ApiResponse.success(getBodyRecordsResponse);
    }

    // # 몸기록 일주일치 몸무게 보내기
}
