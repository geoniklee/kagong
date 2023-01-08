package com.example.kagong.repository;

import com.example.kagong.entity.University;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UniversityRepository {

    @PersistenceContext
    EntityManager em;

    public Long save(University univ){
        em.persist(univ);
        return univ.getUnivId();
    }

    public University findOne(Long id){
        return em.find(University.class, id);
    }

    public List<University> findAll(){
        return em.createQuery("select u from University u", University.class)
                .getResultList();
    }

    public List<University> findByName(String name){
        return em.createQuery("select u from University u where u.univName = :name")
                .setParameter("name", name)
                .getResultList();
    }
}
