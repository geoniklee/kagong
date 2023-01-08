package com.example.kagong.entity;

import lombok.Getter;
import lombok.Setter;
import org.apache.tomcat.jni.Address;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Getter @Setter
public class Cafe {
    @Id @GeneratedValue
    private Long cafeId;

    private String name;
    @Embedded
    private Address address;
    private String mood;
    private int noise;
    private boolean socket;
    private boolean chair;
    private String deskShape;
    private Date openTime;
    private boolean toilet;
    private boolean studyCafe;



    private Long reviewId;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Member member;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Review review;
}
