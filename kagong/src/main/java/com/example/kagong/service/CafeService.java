package com.example.kagong.service;

import com.example.kagong.entity.Cafe;

import com.example.kagong.repository.CafeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class CafeService {

    @Autowired
    private CafeRepository cafeRepository;

    @Transactional
    public Long saveCafe(Cafe cafe) {return cafeRepository.save(cafe); }

    public Cafe findCafe(Long cafeId) {return cafeRepository.findOne(cafeId); }

    public List<Cafe> findAllCafe() {return cafeRepository.findAll();}

    public List<Cafe> findByCafes(String name) {return cafeRepository.findByName(name);}

    @Transactional
    public void deleteCafe(Long cafeId){
        cafeRepository.delete(cafeId);
    }

    public List<Cafe> findByCondition(String mood, int people, int noise, boolean socket, boolean chair, String deskShape, Date openTime) {
        return cafeRepository.findByCondition(mood, people, noise, socket, chair, deskShape, openTime);}
}
