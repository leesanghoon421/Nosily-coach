package com.inti.nosily_coach.domain.food.dto;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DtoFood {
    private String name; // 음식 이름
    private Long kcal; // 칼로리
    private Float protein; // 단백질
    private Float car; // 탄수화물
    private Float fat; // 지방
}
