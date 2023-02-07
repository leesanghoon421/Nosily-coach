package com.inti.nosily_coach.domain.food.Service;

import com.inti.nosily_coach.auth.repository.OAuthRepository;
import com.inti.nosily_coach.domain.DietRecord.model.DietRecord;
import com.inti.nosily_coach.domain.Member.model.Member;
import com.inti.nosily_coach.domain.food.dto.CreateFoodRequest;
import com.inti.nosily_coach.domain.food.dto.GetFoodInfoForAIResponse;
import com.inti.nosily_coach.domain.food.model.Food;
import com.inti.nosily_coach.domain.food.repository.FoodRepository;
import com.querydsl.core.types.Ops;
import com.querydsl.core.types.dsl.NumberOperation;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static com.inti.nosily_coach.domain.food.model.QFood.food;
import static com.querydsl.core.types.dsl.Expressions.numberOperation;

@Service
@RequiredArgsConstructor
public class FoodServiceImpl implements FoodService {
    private final FoodRepository foodRepository;
    private final OAuthRepository memberRepository;
    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public Optional<Food> findOne(String food_name) { // 전체 음식 리스트 중 하나의 음식을 조회하는 메서드
        return foodRepository.findByName(food_name);
    }

    @Override
    public Long createFood(Long memberId, CreateFoodRequest createFoodRequest) {
        Member member = memberRepository.findById(memberId).orElseThrow(()-> new RuntimeException("존재하지 않은 음식입니다."));
        Food food = foodRepository.save(createFoodRequest.toEntity(createFoodRequest.getFoodName(), createFoodRequest.getKcal(), createFoodRequest.getProtein(), createFoodRequest.getProtein(), createFoodRequest.getFat()));
        return food.getId();
    }

    @Override
    public List<Food> viewFood(Long memberId, Pageable pageable) {
        return foodRepository.pageFood(memberId, pageable);
    }

    @Override
    public GetFoodInfoForAIResponse getFoodInfoForAIResponse(Long memberId, Long foodId, LocalDate localDate) {
        Food food = foodRepository.findFoodByDate(memberId, foodId, localDate);
        return GetFoodInfoForAIResponse.of(food.getKcal(), food.getProtein(), food.getCar(), food.getFat());
    }

}
