package com.example.kagong.service;

import com.example.kagong.entity.Cafe;
import com.example.kagong.entity.Member;
import com.example.kagong.repository.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MemberServiceTest {

    @Autowired
    MemberRepository memberRepository;
    @Autowired
    MemberService memberService;


    @Test
    public void testMember() throws Exception {
        Member member = new Member();
        member.setName("memberA");
        Long memberId = memberService.save(member);

        Member findMember = memberService.findOne(memberId);
        Assertions.assertThat(findMember.getMemberId()).isEqualTo(member.getMemberId());
        Assertions.assertThat(findMember.getName()).isEqualTo(member.getName());
        Assertions.assertThat(findMember).isEqualTo(member);
    }


    @Test(expected = AssertionError.class)
    public void testDeleteMember() {
        Member member = new Member();
        member.setName("memberA");
        Long memberId = memberService.save(member);

        memberService.deleteMember(memberId);
        memberService.findOne(memberId);

        fail("없는 카페입니다.");
    }
}