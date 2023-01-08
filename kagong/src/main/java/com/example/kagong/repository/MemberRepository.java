package com.example.kagong.repository;

import com.example.kagong.entity.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {
    @PersistenceContext
    EntityManager em;

    public Long save(Member member) {
        em.persist(member);
        return member.getMemberid();
    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }
}
