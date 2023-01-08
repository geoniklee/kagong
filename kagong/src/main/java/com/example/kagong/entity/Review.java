package com.example.kagong.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter @Setter
public class Review {
    @Id @GeneratedValue
    private long reviewId;

    private String title;
    private String body;
    private Date data;
}
