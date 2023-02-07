package com.inti.nosily_coach.domain.Member.model.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GetMemberinfoForAIResponse {
    private Long gender; // 0 : 여성, 1 : 남성
    private Long age; // 나이

    public static GetMemberinfoForAIResponse of(String sex, Long age) {
        return new GetMemberinfoForAIResponse(sex.equals("female") ? 0L : 1L, age);
    }
}
