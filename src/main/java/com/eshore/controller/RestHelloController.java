package com.eshore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/res")
public class RestHelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot!";
    }

}
