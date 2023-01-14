package com.example.kagong.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@CrossOrigin("*")
public class KagongController {

    @GetMapping("/")
    public String boardWriteperson() {return "person";}

//    @GetMapping("/home")
//    public String signPage() {return "../../Frontend/src/pa";}
}
