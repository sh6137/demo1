package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @Value("${spring.profiles.active}")
    private String profile;

    @GetMapping("/ping")
    public ResponseEntity<String> ping() {

        return new ResponseEntity<>(profile,HttpStatus.OK);
    }
}
