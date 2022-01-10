package com.example.jointest.domain.service;

import com.example.jointest.domain.dto.Dto;
import com.example.jointest.domain.entity.Member;
import com.example.jointest.domain.entity.Team;
import com.example.jointest.domain.repository.MemberRepository;
import com.example.jointest.domain.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;
    @Autowired
    TeamRepository teamRepository;



    public void saveData(Dto dto) {
        Team team = Team.builder()
                .id(dto.getTeam_id())
                .name(dto.getName())
                .build();
        Member member = Member.builder()
                .id(dto.getId())
                .name(dto.getUsername())
                .team(team)
                .build();
        memberRepository.save(member);
        teamRepository.save(team);
    }
}
