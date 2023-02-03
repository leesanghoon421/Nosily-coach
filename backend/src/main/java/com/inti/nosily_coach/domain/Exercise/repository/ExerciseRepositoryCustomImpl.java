package com.inti.nosily_coach.domain.Exercise.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ExerciseRepositoryCustomImpl implements ExerciseRepositoryCustom {
    private final JPAQueryFactory queryFactory;

}
