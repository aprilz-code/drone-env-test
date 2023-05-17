package com.example.dronetest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname IndexController
 * @Description TODO
 * @Date 2023/5/17 17:13
 * @Created by aprilz
 */
@RestController
public class IndexController {

    @Value(value = "${env}")
    private String env;

    @GetMapping("/")
    public String index(){
        return env;
    }
}
