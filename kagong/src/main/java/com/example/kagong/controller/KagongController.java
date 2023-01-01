package com.example.kagong.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class KagongController {

    @GetMapping("/")
    public String boardWriteperson() {return "person";}
}
