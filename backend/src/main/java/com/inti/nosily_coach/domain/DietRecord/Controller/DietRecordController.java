package com.inti.nosily_coach.domain.DietRecord.Controller;

import com.inti.nosily_coach.domain.DietRecord.dto.DtoDietRecord;
import com.inti.nosily_coach.domain.DietRecord.dto.ModifyDietRecord;
import com.inti.nosily_coach.domain.DietRecord.dto.ResponseDietRecord;
import com.inti.nosily_coach.domain.DietRecord.dto.RequestDietRecord;
import com.inti.nosily_coach.domain.DietRecord.Service.DietRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DietRecordController {
    private final DietRecordService dietRecordService;

    @GetMapping("/api/DietRecord/view")
    public List<DtoDietRecord> viewDietRecordApi(Long memberId, @PageableDefault(size = 5) Pageable pageable) { // 식단기록 조회하는 컨트롤러
        List<DtoDietRecord> dietRecord = dietRecordService.viewDietRecord(memberId, pageable);
        return dietRecord;
    }

    @PostMapping("/api/DietRecord/createDiet")
    public ResponseDietRecord createDietRecordApi(Long memberId, @RequestBody RequestDietRecord requestDietRecord) { // 식단기록 추가하는 컨트롤러(메모추가)
        return dietRecordService.createDietRecord(memberId, requestDietRecord);
    }

    @PostMapping("/api/DietRecord/modify/{DietRecordId}")
    public ModifyDietRecord modifyDietRecordApi(Long memberId, @PathVariable("DietRecordId") Long DietRecordId, @RequestBody String memo) { // 식단기록 수정하는 컨트롤러
        return dietRecordService.modifyDietRecord(memberId, DietRecordId, memo);
    }
}
