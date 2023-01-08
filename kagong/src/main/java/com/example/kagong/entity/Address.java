package com.example.kagong.entity;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zip_code;

    protected Address(){
    }

    public void Address(String city, String street, String zip_code){
        this.city = city;
        this.street = street;
        this.zip_code = zip_code;
    }
}
