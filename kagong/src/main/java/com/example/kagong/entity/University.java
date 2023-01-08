package com.example.kagong.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class University {
    @Id @GeneratedValue
    private long univId;

    private String univName;

    @Embedded
    private Address address;
}
