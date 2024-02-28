package com.nickz.springboot3security6.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test-jwt")
public class TestController {

    @GetMapping
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("Secured Endpoint");
    }
}
