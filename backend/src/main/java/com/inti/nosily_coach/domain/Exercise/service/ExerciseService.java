package com.inti.nosily_coach.domain.Exercise.service;

import com.inti.nosily_coach.domain.Exercise.model.dto.*;

import java.awt.print.Pageable;
import java.util.List;

public interface ExerciseService {
    List<GetExerciseResponse> getAllExercises (Pageable pageable);
}
