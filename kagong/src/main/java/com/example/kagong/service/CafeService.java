package com.example.kagong.service;

import com.example.kagong.entity.Cafe;

import com.example.kagong.repository.CafeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class CafeService {

    @Autowired
    private CafeRepository cafeRepository;

    @Transactional
    public Long saveCafe(Cafe cafe) {return cafeRepository.save(cafe); }

    @Transactional
    public Cafe findCafe(Cafe cafe) {return cafeRepository.findOne(cafe.getCafeId()); }

    @Transactional
    public List<Cafe> findAllCafe() {return cafeRepository.findAll();}

    @Transactional
    public List<Cafe> findByCafes(String name) {return cafeRepository.findByName(name);}

    @Transactional
    public void deleteCafe(Long cafeId){
        cafeRepository.delete(cafeId);
    }
}
