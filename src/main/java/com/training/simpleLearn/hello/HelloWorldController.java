package com.training.simpleLearn.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    private String sayHello() {
        return "salam ana java 21";
    }
}
