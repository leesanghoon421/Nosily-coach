package com.inti.nosily_coach.domain.food.Controller;

import com.inti.nosily_coach.domain.food.Service.FoodService;
import com.inti.nosily_coach.domain.food.dto.CreateFoodRequest;
import com.inti.nosily_coach.domain.food.model.Food;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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
    public List<Food> viewFoodsApi(Long memberId, @PageableDefault(size = 5)Pageable pageable) { // 음식들 조회하는 메서드
        List<Food> food = foodService.viewFood(memberId, pageable);
        return food;
    }

    @RequestMapping(value = "/viewfood", method = RequestMethod.GET)
    @ResponseBody
    public Food viewFoodApi(@RequestParam("food_name") String food_name) { // 음식 조회하는 메서드
        return foodService.findOne(food_name).get();
    }
}
