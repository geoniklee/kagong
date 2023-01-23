package com.example.kagong.service;

import com.example.kagong.entity.University;
import com.example.kagong.repository.UniversityRepository;
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
public class UniversityServiceTest {

    @Autowired
    UniversityRepository universityRepository;
    @Autowired
    UniversityService universityService;

    @Test
    public void 대학교_등록(){
        // given
        University univ = new University();
        univ.setUnivName("세종대학교");

        // when
        Long saveId = universityService.save(univ);

        // then
        assertEquals(univ, universityRepository.findOne(saveId));
    }

    @Test(expected = AssertionError.class)
    public void 대학교_삭제(){
        // given
        University univ = new University();
        univ.setUnivName("한양대학교");
        Long deleteId = universityService.save(univ);

        // when
        universityService.deleteUniversity(univ.getUnivId());
        universityService.findUniversity(deleteId);

        // then
        fail("없는 대학교입니다.");
    }

}