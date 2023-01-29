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
    private String mood;//1.무드
    private int people;//2.인원수
    private int noise;//6.소음 크기 0->30~40db 1->40~50db 2->50~60db 3->60~70db
    private boolean socket;//3.콘센트 여부
    private boolean chair;//5.의자 등받이여부
    private String deskShape;//4.책상모양 원형 / 네모
    private Date openTime;//7.운영시간
    private boolean toilet;
    private boolean studyCafe;



    private Long reviewId;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Member member;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Review review;
}
