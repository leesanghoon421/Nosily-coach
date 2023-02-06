package com.inti.nosily_coach.domain.BodyRecord.service;

import com.inti.nosily_coach.domain.BodyRecord.model.dto.GetBodyRecordsResponse;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;

public interface BodyRecordService {
    List<GetBodyRecordsResponse> getAllBodyRecords(Long memberId, Pageable pageable);
    GetBodyRecordsResponse getBodyRecordByDate(Long memberId, LocalDate localDate);
}
