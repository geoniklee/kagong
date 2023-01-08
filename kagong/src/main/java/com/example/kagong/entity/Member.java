package com.example.kagong.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.AttributeConverter;
import javax.persistence.Convert;
import java.io.IOException;
import java.util.List;
@Entity
@Getter @Setter
public class Member {
    @Id
    @GeneratedValue
    private long memberid;

    private String name;

    @Embedded
    private Address address;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private University university;
    private Grade grade;



    @Convert(converter = StringListConverter.class)
    private List<String> historyList;

    @Convert(converter = StringListConverter.class)
    private List<String> favoriteList;

}

