package com.inti.nosily_coach.domain.BodyRecord.model.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GetBodyRecordInfoForAIResponse {
    private Float todayHeight;
    private Float todayWeight;
    private Float bodyFatPercentage;

    public static GetBodyRecordInfoForAIResponse of (Float todayHeight, Float todayWeight, Float bodyFatPercentage) {
        return new GetBodyRecordInfoForAIResponse(todayHeight, todayWeight, bodyFatPercentage);
    }
}