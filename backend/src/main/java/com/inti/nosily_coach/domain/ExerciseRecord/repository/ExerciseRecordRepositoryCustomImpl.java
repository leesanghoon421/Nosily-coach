package com.inti.nosily_coach.domain.ExerciseRecord.repository;

import com.inti.nosily_coach.domain.ExerciseRecord.model.ExerciseRecord;
import com.querydsl.core.types.Ops;
import com.querydsl.core.types.dsl.NumberOperation;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

import static com.inti.nosily_coach.domain.ExerciseRecord.model.QExerciseRecord.exerciseRecord;
import static com.querydsl.core.types.dsl.Expressions.numberOperation;

@RequiredArgsConstructor
public class ExerciseRecordRepositoryCustomImpl implements ExerciseRecordRepositoryCustom{
    private final JPAQueryFactory queryFactory;

    // # recordId로 ExerciseRecord 불러오기
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

    // # 오늘 작성된 게 있는지
    @Override
    public Long getNumOfTodayRecord(Long memberId, LocalDate date) {
        NumberOperation<Integer> toYear = numberOperation(Integer.class, Ops.DateTimeOps.YEAR, exerciseRecord.createdAt);
        NumberOperation<Integer> toMonth = numberOperation(Integer.class, Ops.DateTimeOps.MONTH, exerciseRecord.createdAt);
        NumberOperation<Integer> toDay = numberOperation(Integer.class, Ops.DateTimeOps.DAY_OF_MONTH, exerciseRecord.createdAt);
        return queryFactory.select(exerciseRecord.count())
                .where(
                        // memberId에 해당되는 record인지 확인
                        exerciseRecord.member.id.eq(memberId),
                        // date에 맞는 record 개수
                        toYear.eq(date.getYear()),
                        toMonth.eq(date.getMonthValue()),
                        toDay.eq(date.getDayOfMonth())
                ).fetchOne();
    }
}
