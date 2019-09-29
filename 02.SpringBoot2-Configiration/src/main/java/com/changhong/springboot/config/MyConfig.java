package com.changhong.springboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "myconfig")
@PropertySource("classpath:myconfig.properties") //这个是加载的我们自定义的文件数据
@Data  //这个注解会生成 getters and setters  构造方法  toString方法  equals方法 hashcode方法
public class MyConfig {
    private String title;
    private String message;
    private int age;
    private String address;
}
