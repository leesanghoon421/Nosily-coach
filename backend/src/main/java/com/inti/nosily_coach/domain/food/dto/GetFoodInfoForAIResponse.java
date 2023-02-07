package com.inti.nosily_coach.domain.food.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GetFoodInfoForAIResponse {
    private Long kcal;
    private Float protein;
    private Float car;
    private Float fat;

    public static GetFoodInfoForAIResponse of(Long kcal, Float protein, Float car, Float fat) {
        return new GetFoodInfoForAIResponse(kcal, protein, car, fat);
    }
}
