package com.changhong.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class FirstStartSpringBootDemo {
    public static void main(String[] args) {
        log.info("FirstStartSpringBootDemo is starting now.");
        SpringApplication.run(FirstStartSpringBootDemo.class);
        log.info("FirstStartSpringBootDemo is starting over.");
    }
}
