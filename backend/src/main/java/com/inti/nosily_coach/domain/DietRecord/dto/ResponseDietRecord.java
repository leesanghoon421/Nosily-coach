package com.inti.nosily_coach.domain.DietRecord.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDietRecord {
    private Long DietRecordId; // 식단기록 id

    public static ResponseDietRecord of(@NotNull Long DietRecordId) {
        return new ResponseDietRecord(DietRecordId);
    }
}
