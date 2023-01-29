package com.example.kagong.repository;

import com.example.kagong.entity.Cafe;
import com.example.kagong.entity.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.awt.*;
import java.util.Date;
import java.util.List;

@Repository
public class CafeRepository {
    @PersistenceContext
    EntityManager em;

    public Long save(Cafe cafe) {
        em.persist(cafe);
        return cafe.getCafeId();
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

    public void delete(Long cafeId) {
        em.createQuery("delete from Cafe a where a.cafeId = :cafeId")
                .setParameter("cafeId", cafeId)
                .executeUpdate();
        em.clear();
    }

    public List<Cafe> findByCondition(String mood, int people, int noise, boolean socket, boolean chair,
                                      String deskShape, Date openTime){
        return em.createQuery("select c from Cafe c " +
                        "where (c.mood = :mood AND c.people = :people AND c.noise = :noise AND c.socket = :socket AND c.chair = :chair" +
                        " AND c.deskShape = :deskShape AND c.openTime = :openTime)", Cafe.class)
                .setParameter("mood",mood).setParameter("people",people).setParameter("noise",noise)
                .setParameter("socket",socket).setParameter("chair",chair).setParameter("deskShape",deskShape)
                .setParameter("openTime",openTime)
                .getResultList();//결과가 하나 이상인 경우, 리스트를 반환한다. query.getSingleResult() -> 결과가 정확히 하나, 단일 객체를 반환한다.(정확히 하나가 아니면 예외 발생)
    }
}
