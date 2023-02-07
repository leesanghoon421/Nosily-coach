package com.inti.nosily_coach.domain.Member.model.service;

import com.inti.nosily_coach.domain.Member.model.dto.GetMemberinfoForAIResponse;

public interface MemberService {
    GetMemberinfoForAIResponse getAgeAndSex(Long memberId);
}
