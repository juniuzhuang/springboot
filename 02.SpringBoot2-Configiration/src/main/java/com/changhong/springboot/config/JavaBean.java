package com.changhong.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JavaBean {
    @Value("${app.name}")
    private String name;
    @Value("${app.ip}")
    private String ip;
    @Value("${app.port}")
    private String port;


    public String getBeanData(){
        return name.concat("=").concat(ip).concat("=").concat(port);
    }
}
