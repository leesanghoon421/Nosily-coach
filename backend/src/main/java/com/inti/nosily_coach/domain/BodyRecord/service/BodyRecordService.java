package com.inti.nosily_coach.domain.BodyRecord.service;

import com.inti.nosily_coach.domain.BodyRecord.model.dto.CreateBodyRecordRequest;
import com.inti.nosily_coach.domain.BodyRecord.model.dto.CreateBodyRecordResponse;
import com.inti.nosily_coach.domain.BodyRecord.model.dto.GetBodyRecordsResponse;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.util.List;

public interface BodyRecordService {
    List<GetBodyRecordsResponse> getAllBodyRecords(Long memberId, Pageable pageable);
    GetBodyRecordsResponse getBodyRecordByDate(Long memberId, LocalDate localDate);
    CreateBodyRecordResponse createBodyRecord(Long memberId, @RequestBody CreateBodyRecordRequest request);
}
