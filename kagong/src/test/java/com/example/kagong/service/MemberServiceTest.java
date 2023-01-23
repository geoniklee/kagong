package com.example.kagong.service;

import com.example.kagong.entity.Member;
import com.example.kagong.entity.University;
import com.example.kagong.repository.MemberRepository;
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
    public void 회원등록(){
        // given
        Member member = new Member();
        member.setName("kim");

        // when
        Long saveId = memberService.save(member);

        // then
        assertEquals(member, memberRepository.findOne(saveId));
    }

    @Test(expected = IllegalStateException.class)
    public void 중복회원검증() throws Exception{
        //Given
        Member member1 = new Member();
        member1.setName("kim");
        Member member2 = new Member();
        member2.setName("kim");

        //When
        memberService.save(member1);
        memberService.save(member2); //예외가 발생해야 한다.

        //Then
        fail("예외가 발생해야 한다.");
    }

    @Test(expected = AssertionError.class)
    public void 회원삭제(){
        // given
        Member member = new Member();
        member.setName("kim");
        Long deleteId = memberService.save(member);

        // when
        memberService.deleteMember(member.getMemberId());
        memberService.findOne(deleteId);

        // then
        fail("없는 회원입니다.");
    }

}