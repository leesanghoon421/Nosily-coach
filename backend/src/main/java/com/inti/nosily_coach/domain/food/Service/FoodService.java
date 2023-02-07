package com.inti.nosily_coach.domain.food.Service;

import com.inti.nosily_coach.domain.food.dto.CreateFoodRequest;
import com.inti.nosily_coach.domain.food.dto.GetFoodInfoForAIResponse;
import com.inti.nosily_coach.domain.food.model.Food;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface FoodService {
//
    Long createFood(Long memberId, CreateFoodRequest createFoodRequest);
    Optional<Food> findOne(String food_name);
    List<Food> viewFood(Long memberId, Pageable pageable);
    GetFoodInfoForAIResponse getFoodInfoForAIResponse(Long memberId, Long foodId, LocalDate localDate);
}
