package com.inti.nosily_coach.domain.Exercise.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Exercise {
    /* 기본 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedDate  // 생성일자 어노테이션
    @Column(updatable = false) // column을 지정할 때 사용하는 어노테이션 > 옆에 updatable=false는 말그대로 수정 안된다는 뜻
    private LocalDateTime createdAt;

    @LastModifiedDate // 업데이트 일자 어노테이션
    private LocalDateTime updatedAt;

    public void updateUpdatedAt(@NotNull LocalDateTime updatedAt) { // NotNull : 값이 null일 수 없을 때 사용하는 어노테이션
        this.updatedAt = updatedAt;
    }

    /* Exercise Column */
    @Column(length = 20)
    private String name; // 운동명

    @Column(length = 3000)
    private String description; // 운동 설명

    @Column(nullable = false)
    private String type; // 분류 : 스트레칭, 유산소, 무산소

    @Column(nullable = false)
    private String position; // 영향 위치 : 전체, 팔, 다리 등

    @Column(nullable = false)
    private String url; // 운동영상 url

    @Column(nullable = false)
    private String recCount; // 1회 추천 횟수

    @Column(nullable = false)
    private String recSet; // set 추천 횟수
}
