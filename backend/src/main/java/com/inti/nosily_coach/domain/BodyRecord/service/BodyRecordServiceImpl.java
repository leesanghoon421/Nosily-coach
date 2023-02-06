package com.inti.nosily_coach.domain.BodyRecord.service;

import com.inti.nosily_coach.domain.BodyRecord.model.BodyRecord;
import com.inti.nosily_coach.domain.BodyRecord.model.dto.GetBodyRecordsResponse;
import com.inti.nosily_coach.domain.BodyRecord.repository.BodyRecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BodyRecordServiceImpl implements BodyRecordService {
    private final BodyRecordRepository bodyRecordRepository;

    // # 몸기록 전체 조회
    @Override
    @Transactional
    public List<GetBodyRecordsResponse> getAllBodyRecords(Long memberId, Pageable pageable) {
        return bodyRecordRepository.findAllByMemberId(memberId, pageable).stream()
                .map(record -> GetBodyRecordsResponse.of(record.getId(), record.getHeight(),
                                record.getWeight(), record.getBodyFatPercentage(), record.getMuscle(),
                                record.getCreatedAt().format(DateTimeFormatter.ofPattern("yy년 MM월 dd일 E요일"))))
                .collect(Collectors.toList());
    }

    // # 몸기록 날짜로 조회 (하루에 하나만 작성 가능하기 때문에 list X)
    @Override
    @Transactional
    public GetBodyRecordsResponse getBodyRecordByDate(Long memberId, LocalDate localDate) {
        BodyRecord record = bodyRecordRepository.findByDate(memberId, localDate);
        return GetBodyRecordsResponse.of(record.getId(), record.getHeight(), record.getWeight(),
                record.getBodyFatPercentage(), record.getMuscle(), record.getCreatedAt().format(DateTimeFormatter.ofPattern("yy년 MM월 dd일 E요일")));
    }
}
