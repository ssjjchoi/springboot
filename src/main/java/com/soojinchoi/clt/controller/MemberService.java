package com.soojinchoi.clt.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/members") // 공통 경로
public class MemberService {

    @GetMapping("/")
    @ApiOperation("회원조회")
    //public void get() {
        //return "회원 목록 조회";
    public String get() {
        return "Hello, 회원 목록 조회!";
    }

    @PostMapping("/")
    @ApiOperation("회원등록")
    public void register() {

    }

    @DeleteMapping("/{id}")
    @ApiOperation("회원삭제")
    public void delete(@PathVariable Long id) {

    }

}


