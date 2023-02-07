package com.inti.nosily_coach.auth.repository;

import com.inti.nosily_coach.domain.Member.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OAuthRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmailAndProvider(String email, String provider);
    Optional<Member> findById(Long memberId);
}