package com.geon.publicmoneycalendar.controller;

import com.geon.publicmoneycalendar.domain.Member;
import com.geon.publicmoneycalendar.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/{id}")
    public Member memberInfo(@PathVariable Long id) {
        return memberService.getMember(id);
    }
}
