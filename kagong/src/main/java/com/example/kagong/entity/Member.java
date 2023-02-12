package com.example.kagong.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Convert;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Getter @Setter
public class Member {
    @Id
    @GeneratedValue
    private Long memberId;

    private String name;
    @Column(length = 100, nullable = false, unique = true)
    private String email;
    @Column(length = 100, nullable = false)
    private String password;
    private String nickName;

    @Embedded
    private Address address;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private University university;
    private Grade grade;



    @Convert(converter = StringListConverter.class)
    private List<String> historyList;

    @Convert(converter = StringListConverter.class)
    private List<String> favoriteList;

    @ElementCollection(fetch = FetchType.EAGER)
    @Builder.Default
    private List<String> roles = new ArrayList<>();


    public Member(){

    }

    public Member(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles.stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }
}

