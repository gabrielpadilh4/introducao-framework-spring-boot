package com.github.gabrielpadilh4.springbootconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}")
    public String appMessage;

    @Value("${JAVA_HOME:NOT_DEFINED}") // system variable
    private String javaHomeVariable;

    @GetMapping("/")
    public String getAppMessage() {
        return appMessage;
    }

    @GetMapping("/envVariable")
    public String getJavaHomeVariable() {
        return "%JAVA_HOME% -> " + javaHomeVariable;
    }
}
