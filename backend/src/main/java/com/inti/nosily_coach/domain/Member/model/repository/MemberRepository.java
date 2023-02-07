package com.inti.nosily_coach.domain.Member.model.repository;

import com.inti.nosily_coach.domain.Member.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
