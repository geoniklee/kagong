package com.example.kagong.controller;

import com.example.kagong.entity.Cafe;
import com.example.kagong.service.CafeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin(origins ="*", maxAge = 30)
@RestController
@RequestMapping("/search")
@RequiredArgsConstructor
public class SearchController {

    private final CafeService cafeService;

    @PostMapping("/main")
    public List<Cafe> searchCafeByName(@RequestBody String cafeName){
        System.out.println("카페 검색");
        List<Cafe> findCafes = cafeService.findByCafes(cafeName);
        return findCafes;
    }

    @PostMapping("/map/condition")
    public List<Cafe> searchCafeByConditions(@RequestBody String mood, @RequestBody int people, @RequestBody int noise,
                                             @RequestBody boolean socket, @RequestBody boolean chair, @RequestBody String deskShape,
                                             @RequestBody Date openTime, @RequestBody boolean toilet, @RequestBody boolean studyCafe){
        System.out.println("카페 조건 검색");
        List<Cafe> findCafes = cafeService.findByCondition(mood, people, noise, socket, chair, deskShape, openTime);
        return findCafes;
    }
}
