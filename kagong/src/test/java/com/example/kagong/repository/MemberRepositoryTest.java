package com.example.kagong.repository;

import com.example.kagong.entity.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    @Transactional
    @Rollback(false)
    void 회원가입() {
        Member member = new Member();
        member.setName("memberA");
        Long saveId = memberRepository.save(member);

        Member findMember = memberRepository.findOne(saveId);

        Assertions.assertThat(findMember.getMemberId()).isEqualTo(member.getMemberId());
        Assertions.assertThat(findMember.getName()).isEqualTo(member.getName());

        Assertions.assertThat(findMember).isEqualTo(member);
    }

    @Test
    void find() {
    }
}