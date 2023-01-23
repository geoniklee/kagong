package com.example.kagong.repository;

import com.example.kagong.entity.Review;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ReviewRepository {
    @PersistenceContext
    EntityManager em;

    public Long save(Review review) {
        em.persist(review);
        return review.getReviewId();
    }

    public Review findOne(Long id){
        return em.find(Review.class, id);
    }

    public List<Review> findAll() {
        return em.createQuery("select r from Review r", Review.class)
                .getResultList();
    }

    public void deleteReview(Long reviewId){
        em.createQuery("delete from Review r where r.reviewId = :reviewId")
                .setParameter("reviewId", reviewId)
                .executeUpdate();
        em.clear();
    }
}
