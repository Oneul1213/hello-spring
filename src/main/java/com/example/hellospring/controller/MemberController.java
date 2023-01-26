package com.example.hellospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.hellospring.service.MemberService;

@Controller
public class MemberController {
    
    private final MemberService memberService;

    @Autowired  // DI
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}