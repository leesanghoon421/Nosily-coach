package com.inti.nosily_coach.domain.food.Controller;

import com.inti.nosily_coach.domain.food.Service.FoodService;
import com.inti.nosily_coach.domain.food.dto.CreateFoodRequest;
import com.inti.nosily_coach.domain.food.dto.DtoFood;
import com.inti.nosily_coach.domain.food.model.Food;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@RestController
@RequestMapping("api") // 백엔드 URL(api 방식으로 통신하고 있기 때문에)
public class FoodController {
    private final FoodService foodService;
    @RequestMapping(value = "/food", method = RequestMethod.POST)
    @ResponseBody
    public Long createFoodApi(Long memberId, @RequestBody CreateFoodRequest createFoodRequest) { // 데이터를 반환하는 메서드

        Food food = Food.newFood(createFoodRequest.getFoodName(), createFoodRequest.getKcal(), createFoodRequest.getProtein(), createFoodRequest.getCar(), createFoodRequest.getFat());
        return foodService.createFood(memberId, createFoodRequest);
    }

    @RequestMapping(value = "/viewfoods", method = RequestMethod.GET)
    @ResponseBody
    public List<DtoFood> viewFoodsApi(Long memberId, @PageableDefault(size = 5) Pageable pageable) { // 음식들 조회하는 메서드
        List<DtoFood> foods = foodService.viewFood(memberId, pageable).stream().map(
                food -> DtoFood.of(food.getId(), food.getName(), food.getKcal(), food.getProtein(), food.getCar(), food.getFat())).collect(Collectors.toList());
        return foods;
    }
}
