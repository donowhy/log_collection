package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {
    static int i = 0;

    @GetMapping("/")
    public String test() {
        i++;
        log.info("test = {}", i);
        return "Hello";
    }
}
