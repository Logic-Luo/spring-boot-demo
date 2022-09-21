package com.logic.spring.boot.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping("/")
    public String Hello() {
        log.info("testlog");
        return "hello world";
    }
}
