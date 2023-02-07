package com.inti.nosily_coach.domain.food.dto;

import com.inti.nosily_coach.domain.food.model.Food;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CreateFoodRequest {
    private String foodName;
    private Long kcal;
    private Float protein;
    private Float car;
    private Float fat;

    public static CreateFoodRequest of(String foodName, Long kcal, Float protein, Float car, Float fat) {
        return new CreateFoodRequest(foodName, kcal, protein, car, fat);
    }

    public static Food toEntity(String foodName, Long kcal, Float protein, Float car, Float fat) {
        return Food.newFood(foodName, kcal, protein, car, fat);
    }
}
