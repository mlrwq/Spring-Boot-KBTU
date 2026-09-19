package com.example.practice_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice_2.config.AppProperties;

@RestController
public class HelloController {

    private final AppProperties appProperties;

    public HelloController(AppProperties appProperties){
        this.appProperties = appProperties;
    }

    @GetMapping("/api/hello")
    public String hello(){
        return appProperties.message();
    }

    @GetMapping("/api/info")
    public String info() {
        return appProperties.name() + " - Version: " + appProperties.version();
    }

}
