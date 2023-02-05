package com.inti.nosily_coach.domain.ExerciseRecord.repository;

import com.inti.nosily_coach.domain.ExerciseRecord.model.ExerciseRecord;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import static com.inti.nosily_coach.domain.ExerciseRecord.model.QExerciseRecord.exerciseRecord;
@RequiredArgsConstructor
public class ExerciseRecordRepositoryCustomImpl implements ExerciseRecordRepositoryCustom{
    private final JPAQueryFactory queryFactory;

    @Override
    public ExerciseRecord findExerciseRecordByRecordId(Long memberId, Long recordId) {
        return queryFactory.selectFrom(exerciseRecord)
                .where(
                        // memberId에 해당되는 record인지 확인
                        exerciseRecord.member.id.eq(memberId),
                        // recordId에 해당되는 record만 추출
                        exerciseRecord.id.eq(recordId)
                        )
                .fetchOne();
    }
}
