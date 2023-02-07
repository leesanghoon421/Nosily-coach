package com.inti.nosily_coach.domain.Member.model.service;

import com.inti.nosily_coach.domain.Member.model.Member;
import com.inti.nosily_coach.domain.Member.model.dto.GetMemberinfoForAIResponse;
import com.inti.nosily_coach.domain.Member.model.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

    @Override
    @Transactional
    public GetMemberinfoForAIResponse getAgeAndSex(Long memberId) {
        Member member = memberRepository.findById(memberId).orElseThrow(() -> new RuntimeException("해당되는 회원이 없습니다."));
        return GetMemberinfoForAIResponse.of(member.getSex(), member.getAge());
    }
}
