package com.soojinchoi.clt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

    @GetMapping("/")
    public String redirectToMembers() {
        return "redirect:/members/"; // 루트 접속 시 /members/로 이동
    }
}
