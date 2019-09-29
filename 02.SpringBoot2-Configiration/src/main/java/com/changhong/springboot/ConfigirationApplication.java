package com.changhong.springboot;

import com.changhong.springboot.config.MyConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 欢迎学习springboot2  后续我会给出很多关于springboot2的案例给大家学习。
 * 有什么问题请加群 QQ ：674948698
 */
@SpringBootApplication
@Slf4j
public class ConfigirationApplication {

    @Autowired
    MyConfig myConfig;
    public static void main(String[] args) {
        log.info("ConfigirationApplication is start");
        SpringApplication.run(ConfigirationApplication.class);
        log.info("ConfigirationApplication is over");
    }
}
