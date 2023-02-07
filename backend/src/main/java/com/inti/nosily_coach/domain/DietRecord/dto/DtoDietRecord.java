package com.inti.nosily_coach.domain.DietRecord.dto;

import com.inti.nosily_coach.domain.Eat.dto.DtoEat;
import lombok.*;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DtoDietRecord {
    private Long DietRecordId; // 식단기록 id
    private String createAt; // 생성날짜
    private String memo; // 메모
    private List<DtoEat> eats; // 식단기록 리스트

    public static DtoDietRecord of(Long DietRecordId, String createAt, String memo, List<DtoEat> eats) {
        return new DtoDietRecord(DietRecordId, createAt, memo, eats);
    }
}
