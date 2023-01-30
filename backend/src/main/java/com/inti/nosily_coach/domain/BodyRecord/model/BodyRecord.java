package com.inti.nosily_coach.domain.BodyRecord.model;

import com.inti.nosily_coach.domain.Member.model.Member;
import com.inti.nosily_coach.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class BodyRecord extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(nullable = true)
    private Float height;

    @Column(nullable = true)
    private Float weight;

    @Builder(access = AccessLevel.PRIVATE)
    private BodyRecord(Member member, Float height, Float weight) {
        this.member = member;
        this.height = height;
        this.weight = weight;
    }

    public static BodyRecord newBodyRecord(Member member, Float height, Float weight) {
        return BodyRecord.builder()
                .member(member)
                .height(height)
                .weight(weight)
                .build();
    }
}
