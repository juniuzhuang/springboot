package com.changhong.springboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("app")
@Data
public class AppConfig {
    private String name;
    private String ip;
    private String port;
}
