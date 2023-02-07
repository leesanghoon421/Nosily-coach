package com.inti.nosily_coach.domain.Eat.Service;

import com.inti.nosily_coach.domain.DietRecord.model.DietRecord;
import com.inti.nosily_coach.domain.DietRecord.repository.DietRecordRepository;
import com.inti.nosily_coach.domain.Eat.dto.DtoEat;
import com.inti.nosily_coach.domain.Eat.dto.ModifyEat;
import com.inti.nosily_coach.domain.Eat.dto.RequestEat;
import com.inti.nosily_coach.domain.Eat.dto.ResponseEat;
import com.inti.nosily_coach.domain.Eat.model.Eat;
import com.inti.nosily_coach.domain.Eat.repository.EatRepository;
import com.inti.nosily_coach.domain.food.model.Food;
import com.inti.nosily_coach.domain.food.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EatServiceImpl implements EatService {
    private final EatRepository eatRepository;
    private final FoodRepository foodRepository;
    private final DietRecordRepository dietRecordRepository;

    @Override
    @Transactional
    public List<DtoEat> viewEat(Long foodId, Pageable pageable) {
        return eatRepository.pageEat(foodId, pageable)
                .stream().map(eat -> DtoEat.of(eat.getId(), eat.getFood().getName(),eat.getTime(), eat.getIntake())).collect(Collectors.toList());
    }

//    public List<DtoEat> viewEat(List<Eat> eats) {
//        return eats.stream().map(eat -> DtoEat.of(eat.getFood().getId(), eat.getFood().getName(), eat.getTime(), eat.getIntake())).collect(Collectors.toList());
//    }

    @Override
    @Transactional
    public ResponseEat createEat(Long memberId, Long foodId, RequestEat requestEat) {
        LocalDate localDate = LocalDate.now();
        DietRecord dietRecord = dietRecordRepository.findDietRecordByDate(memberId, localDate);
        Food food = foodRepository.findById(foodId).orElseThrow(() -> new RuntimeException("존재하지 않은 음식입니다."));
        Eat eat = eatRepository.save(requestEat.ToEntity(dietRecord, food, requestEat.getTime(), requestEat.getIntake()));
        return ResponseEat.of(food);
    }

//    public void createEat(DietRecord dietRecord, Eat eat, String time, Long intake) {
//        eatRepository.save(Eat.newEat(dietRecord, eat.getFood(), time, intake));
//    }

    @Override
    @Transactional
    public ModifyEat modifyEat(Long memberId, Food food, Long DietRecordId, RequestEat requestEat) {
        Eat eat = eatRepository.findEatByfoodName(memberId, food, DietRecordId);
        eat.updateEat(requestEat.getTime(), requestEat.getIntake());
        return ModifyEat.of(food);
    }

    @Override
    @Transactional
    public void selectEat() {

    }
}
