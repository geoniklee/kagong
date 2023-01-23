package com.example.kagong.service;

import com.example.kagong.entity.Member;
import com.example.kagong.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class MemberService {
    @Autowired
    MemberRepository memberRepository;
//    private final MemberRepository memberRepository;

    /*
     * 회원가입
     */
    @Transactional // 변경
    public Long save(Member member){
        // 중복 회원 검증
        validateDuplicateMember(member);
        // DB에 회원 저장.
        return memberRepository.save(member);
    }

    // member id 로 바꿔야할 것 같기도함.
    private void validateDuplicateMember(Member member) {
        List<Member> findMembers = memberRepository.findByName(member.getName());

        if(!findMembers.isEmpty()){
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }

    /*
     * 전체 회원 조회
     */
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    /*
     * 회원 단일 조회
     */
    public Member findOne(Long memberId){
        return memberRepository.findOne(memberId);
    }

    /*
     * 회원 삭제
     */
    public void deleteMember(Long memberId){
        memberRepository.deleteOne(memberId);
    }

}

