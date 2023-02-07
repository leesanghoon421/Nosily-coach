package com.inti.nosily_coach.domain.Member.model.service;

import com.inti.nosily_coach.domain.Member.model.Member;
import com.inti.nosily_coach.domain.Member.model.dto.GetMemberinfoForAIResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inti.nosily_coach.auth.repository.OAuthRepository;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final OAuthRepository memberRepository;

    @Override
    @Transactional(readOnly = true)
    public GetMemberinfoForAIResponse getAgeAndSex(Long memberId) {
        Member member = memberRepository.findById(memberId).orElseThrow(()->new RuntimeException("존재하지 않은 회원입니다."));
        return GetMemberinfoForAIResponse.of(member.getSex(), member.getAge());
    }
}
