package com.geon.publicmoneycalendar.service;

import com.geon.publicmoneycalendar.domain.Member;
import com.geon.publicmoneycalendar.domain.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public Member getMember(Long id) {
        return memberRepository.findById(id)
                               .orElseThrow(IllegalArgumentException::new);
    }
}
