package com.inti.nosily_coach.domain.ExerciseRecord.service;

import com.inti.nosily_coach.auth.repository.MemberRepository;
import com.inti.nosily_coach.domain.ExerciseRecord.model.ExerciseRecord;
import com.inti.nosily_coach.domain.ExerciseRecord.model.dto.CreateExerciseRecordRequest;
import com.inti.nosily_coach.domain.ExerciseRecord.model.dto.CreateExerciseRecordResponse;
import com.inti.nosily_coach.domain.ExerciseRecord.model.dto.UpdateExerciseRecordResponse;
import com.inti.nosily_coach.domain.ExerciseRecord.repository.ExerciseRecordRepository;
import com.inti.nosily_coach.domain.Member.model.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ExerciseRecordServiceImpl implements ExerciseRecordService {
    private final ExerciseRecordRepository exerciseRecordRepository;
    private final MemberRepository memberRepository;

    // # 운동기록 작성
    @Override
    @Transactional
    public CreateExerciseRecordResponse createExerciseRecord(Long memberId, CreateExerciseRecordRequest request) {
        Member member = memberRepository.findById(memberId).orElseThrow(() -> new RuntimeException("존재하지 않은 회원입니다."));
        ExerciseRecord exerciseRecord = exerciseRecordRepository.save(request.toEntity(member));

        return CreateExerciseRecordResponse.of(exerciseRecord.getId());
    }

    // # 운동기록 수정
    @Override
    @Transactional
    public UpdateExerciseRecordResponse updateExerciseRecord(Long memberId, Long recordId, String memo) {
        ExerciseRecord exerciseRecord = exerciseRecordRepository.findExerciseRecordByRecordId(memberId, recordId);
        exerciseRecord.update(memo);

        return UpdateExerciseRecordResponse.of(recordId);
    }
}
