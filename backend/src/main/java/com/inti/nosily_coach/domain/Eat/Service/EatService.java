package com.inti.nosily_coach.domain.Eat.Service;

import com.inti.nosily_coach.domain.DietRecord.model.DietRecord;
import com.inti.nosily_coach.domain.Eat.dto.DtoEat;
import com.inti.nosily_coach.domain.Eat.dto.ModifyEat;
import com.inti.nosily_coach.domain.Eat.dto.RequestEat;
import com.inti.nosily_coach.domain.Eat.dto.ResponseEat;
import com.inti.nosily_coach.domain.food.model.Food;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EatService {
    List<DtoEat> viewEat(Long foodId, Pageable pageable);
    ResponseEat createEat(Long memberId, Long foodId, RequestEat requestEat);
    ModifyEat modifyEat(Long memberId, Food food, Long DietRecordId, RequestEat requestEat);
    void selectEat();
}
