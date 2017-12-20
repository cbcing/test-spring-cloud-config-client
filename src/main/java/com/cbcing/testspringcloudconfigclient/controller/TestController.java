package com.cbcing.testspringcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {
//
//    @Value("${from}")
//    private String from;
//
//    @Autowired
//    private Environment environment;

    @RequestMapping("/from")
    public String from() {
        return "from";
    }

//    @RequestMapping("/env")
//    public String env() {
//        return environment.getProperty("from", "undefined");
//    }

}
