package com.inti.nosily_coach.domain.Eat.dto;

import com.inti.nosily_coach.domain.food.model.Food;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseEat {
    private Food food; // 음식 정보

    public static ResponseEat of(@NotNull Food food) {
        return new ResponseEat(food);
    }
}
