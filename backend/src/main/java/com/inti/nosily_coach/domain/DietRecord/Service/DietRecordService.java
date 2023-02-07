package com.inti.nosily_coach.domain.DietRecord.Service;

import com.inti.nosily_coach.domain.DietRecord.dto.DtoDietRecord;
import com.inti.nosily_coach.domain.DietRecord.dto.ModifyDietRecord;
import com.inti.nosily_coach.domain.DietRecord.dto.ResponseDietRecord;
import com.inti.nosily_coach.domain.DietRecord.dto.RequestDietRecord;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DietRecordService {
    List<DtoDietRecord> viewDietRecord(Long memberId, Pageable pageable); // 조회하는 메서드
    ResponseDietRecord createDietRecord(Long memberId, RequestDietRecord requestDietRecord); // 생성하는 메서드
    ModifyDietRecord modifyDietRecord(Long memberId, Long DietRecordId, String memo); // 수정하는 메서드
}
