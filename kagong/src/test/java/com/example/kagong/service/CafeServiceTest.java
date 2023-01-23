package com.example.kagong.service;

import com.example.kagong.entity.Cafe;
import com.example.kagong.repository.CafeRepository;
import org.assertj.core.api.Assertions;

//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartException;


import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class CafeServiceTest {
    @Autowired
    CafeRepository cafeRepository;
    @Autowired
    CafeService cafeService;

    @Test
    public void testCafe() throws Exception {
        Cafe cafe = new Cafe();
        cafe.setName("cafeA");
        Long cafeId = cafeService.saveCafe(cafe);

        Cafe findCafe = cafeService.findCafe(cafeId);
        Assertions.assertThat(findCafe.getCafeId()).isEqualTo(cafe.getCafeId());
        Assertions.assertThat(findCafe.getName()).isEqualTo(cafe.getName());
        Assertions.assertThat(findCafe).isEqualTo(cafe);
    }

    @Test(expected = AssertionError.class)
    public void testDeleteCafe() {
        Cafe cafe = new Cafe();
        cafe.setName("cafeA");
        Long cafeId = cafeService.saveCafe(cafe);

        cafeService.deleteCafe(cafeId);
        cafeService.findCafe(cafeId);

        fail("없는 카페입니다.");
    }
}