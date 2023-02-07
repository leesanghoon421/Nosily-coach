package com.inti.nosily_coach.domain.AI.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GetNutritionalInfoResponse {
    private Float Car; // 탄수화물
    private Float protein; // 단백질
    private Float fat; // 지방
    private Long kcal; // 칼로리

    private Long age; // 나이
    private Long sex; // 성별 (male = 1, female=0)

    private Float todayHeight; // 오늘 키
    private Float todayWeight; // 오늘 몸무게

    private Float exerciseTimeOfWeek; // 일주일 운동시간

    public static GetNutritionalInfoResponse of(Float Car, Float protein, Float fat, Long kcal,
                                           Long age, Long sex,
                                           Float todayHeight, Float todayWeight,
                                           Float exerciseTimeOfWeek) {
        return new GetNutritionalInfoResponse(Car, protein, fat, kcal,
                age, sex, todayHeight, todayWeight, exerciseTimeOfWeek);
    }
}
