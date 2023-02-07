package com.inti.nosily_coach.domain.Eat.Controller;

import com.inti.nosily_coach.domain.DietRecord.Service.DietRecordService;
import com.inti.nosily_coach.domain.DietRecord.repository.DietRecordRepository;
import com.inti.nosily_coach.domain.Eat.dto.DtoEat;
import com.inti.nosily_coach.domain.Eat.dto.ModifyEat;
import com.inti.nosily_coach.domain.Eat.dto.RequestEat;
import com.inti.nosily_coach.domain.Eat.dto.ResponseEat;
import com.inti.nosily_coach.domain.Eat.Service.EatService;
import com.inti.nosily_coach.domain.food.model.Food;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/Eat")
@RequiredArgsConstructor
public class EatController {
    private final EatService eatService;

    @GetMapping("/view")
    public List<DtoEat> viewEatApi(Long foodId, @PageableDefault(size = 5) Pageable pageable) {
        List<DtoEat> eat = eatService.viewEat(foodId, pageable);
        return eat;
    }

    @PostMapping("/create")
    public ResponseEat createEatApi(Long memberId, Long foodId, @RequestBody RequestEat requestEat) {
        return eatService.createEat(memberId, foodId, requestEat);
    }

    @PostMapping("/modify")
    public ModifyEat modifyEat(Long memberId, @PathVariable("food") Food food, @PathVariable("DietRecord") Long DietRecordId, @RequestBody RequestEat requestEat) {
        return eatService.modifyEat(memberId, food, DietRecordId, requestEat);
    }
}
