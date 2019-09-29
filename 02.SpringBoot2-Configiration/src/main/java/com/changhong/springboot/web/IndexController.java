package com.changhong.springboot.web;

import com.changhong.springboot.config.AppConfig;
import com.changhong.springboot.config.JavaBean;
import com.changhong.springboot.config.MyConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//http://localhost:9090/mydata  访问这个地址
// MyConfig(title=hello, message=hello world, age=12, address=天府软件园)
@Slf4j
public class IndexController {
    @Autowired
    MyConfig myConfig;
    @Autowired
    AppConfig appConfig;
    @Autowired
    JavaBean javaBean;

    @RequestMapping("mydata")
    public String getMyConfigData(){
        log.info("AppConfig data is [{}]",appConfig);
        log.info("JavaBean data is [{}]",javaBean.getBeanData());
        return myConfig.toString();
    }
}
