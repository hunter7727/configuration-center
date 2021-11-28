package com.hunter.business;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
@RequestMapping("configuration")
public class Configuration {

    @Value("${name}")
    private String name;

    @RequestMapping("getName")
    public String getName(){
        return name;
    }
}
