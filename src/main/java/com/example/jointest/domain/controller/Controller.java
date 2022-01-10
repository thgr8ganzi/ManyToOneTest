package com.example.jointest.domain.controller;

import com.example.jointest.domain.dto.Dto;
import com.example.jointest.domain.entity.Member;
import com.example.jointest.domain.entity.Team;
import com.example.jointest.domain.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private MemberService memberService;

    @PostMapping(value = "/saved", produces = "application/json; charset=utf-8")
    public void saveData(@RequestBody Dto dto){
        memberService.saveData(dto);
    }

}
