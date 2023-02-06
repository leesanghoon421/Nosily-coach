package com.inti.nosily_coach.domain.BodyRecord.model.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CreateBodyRecordResponse {
    private Long recordId;

    public CreateBodyRecordResponse of(Long recordId) {
        return new CreateBodyRecordResponse(recordId);
    }
}
