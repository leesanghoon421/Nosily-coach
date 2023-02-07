package com.inti.nosily_coach.domain.food.dto;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DtoFood {
    private Long foodId;
    private String name; // 음식 이름
    private Long kcal; // 칼로리
    private Float protein; // 단백질
    private Float car; // 탄수화물
    private Float fat; // 지방

    public static DtoFood of(Long foodId, String name,
                             Long kcal, Float protein,
                             Float car, Float fat) {
        return new DtoFood(foodId, name, kcal, protein, car, fat);
    }
}
