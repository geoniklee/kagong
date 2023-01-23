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


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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
        member.setName("kim");

        // when
        Long saveId = memberService.save(member);

        // then
        Assertions.assertThat(member.getMemberId()).isEqualTo(saveId);
//        Assertions.assertEquals(member, memberService.findOne(saveId));
    }

    @Test(expected = IllegalStateException.class)
    public void 중복회원검증() throws Exception{
        // given
        Member member1 = new Member();
        member1.setName("kim");

        Member member2 = new Member();
        member2.setName("kim");

        // when
        memberService.save(member1);
        memberService.save(member2);

        // then
        fail("failed to save");
    }

    @Test(expected = AssertionError.class)
    public void 회원삭제() throws Exception{
        //given
        Member member = new Member();
        member.setName("kim");
        Long deleteId = memberService.save(member);

        //when
        memberService.deleteMember(deleteId);
        memberService.findOne(deleteId);

        // then
        fail("없는 회원입니다");


        member.setName("memberA");
        Long memberId = memberService.save(member);

        memberService.deleteMember(memberId);
        memberService.findOne(memberId);

        fail("없는 카페입니다.");
    }
}