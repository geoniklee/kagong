package com.example.kagong.repository;

import com.example.kagong.entity.Cafe;
import com.example.kagong.entity.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.awt.*;
import java.util.List;

@Repository
public class CafeRepository {
    @PersistenceContext
    EntityManager em;

    public void save(Cafe cafe) {
        em.persist(cafe);
    }

    public Cafe findOne(Long id){
        return em.find(Cafe.class, id);
    }

    public List<Cafe> findAll() {
        return em.createQuery("select c from Cafe c", Cafe.class)
                .getResultList();
    }

    public List<Cafe> findByName(String name) {
        return em.createQuery("select c from Cafe c where c.name = :name", Cafe.class)
                .setParameter("name",name)
                .getResultList();
    }
}
