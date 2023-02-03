package com.inti.nosily_coach.domain.Exercise.repository;

import com.inti.nosily_coach.domain.Exercise.model.Exercise;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface ExerciseRepository extends JpaRepository<Exercise, Long>, ExerciseRepositoryCustom {
    Page<Exercise> findAll(Pageable pageable);
}
