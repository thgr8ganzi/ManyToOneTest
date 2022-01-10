package com.example.jointest;

import com.example.jointest.domain.entity.Member;
import com.example.jointest.domain.entity.Team;
import com.example.jointest.domain.repository.MemberRepository;
import com.example.jointest.domain.repository.TeamRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Log4j2
@SpringBootTest
class JoinTestApplicationTests {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Test
    public void insertMember(){
        Team team = Team.builder()
                .id(null)
                .name("888")
                .build();

        System.out.println("==========================");
        System.out.println(team.toString());

        Member member = Member.builder()
                .id(null)
                .name("ABC")
                .team(team)
                .build();


        System.out.println("==========================");
        teamRepository.save(team);
        memberRepository.save(member);

        System.out.println("==========================");
        System.out.println(team.toString());
        System.out.println(member.toString());
    }


}
