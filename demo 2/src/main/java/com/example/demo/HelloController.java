package com.example.demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Slf4j(topic = "kafka-logger")
@RestController
@RequiredArgsConstructor
public class HelloController {

    @GetMapping({"", "/hello"})
    public String hello() throws IOException {
        // kafka logger에 로그 남기기
        log.info("hello~!@");
        return "hello";
    }
}