package com.inti.nosily_coach.domain.SelectedExercise.service;

import com.inti.nosily_coach.domain.Exercise.model.Exercise;
import com.inti.nosily_coach.domain.ExerciseRecord.model.ExerciseRecord;
import com.inti.nosily_coach.domain.SelectedExercise.model.SelectedExercise;
import com.inti.nosily_coach.domain.SelectedExercise.repository.SelectedExerciseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalTime;

@Service
@RequiredArgsConstructor
public class SelectedExerciseServiceImpl implements SelectedExerciseService{
    private final SelectedExerciseRepository selectedExerciseRepository;

    // 매핑
    @Override
    @Transactional
    public void createSelectedExercise(Exercise exercise, ExerciseRecord exerciseRecord, LocalTime times, int counts, int setCnt) {
        selectedExerciseRepository.save(SelectedExercise.newSelectedExercise(exerciseRecord, exercise, times, counts, setCnt));
    }

    // 매핑 수정
    @Override
    @Transactional
    public void updateSelectedExercise(SelectedExercise selectedExercise, LocalTime times, int counts, int setCnt) {
        selectedExercise.update(times, counts, setCnt);
    }

    // 매핑 삭제
    @Override
    @Transactional
    public void deleteSelectedExercise(SelectedExercise selectedExercise) {
        selectedExerciseRepository.delete(selectedExercise);
    }
}
