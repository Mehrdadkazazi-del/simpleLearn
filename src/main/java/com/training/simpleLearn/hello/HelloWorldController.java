package com.training.simpleLearn.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/sayHello")
    private String sayHello(@RequestParam(value = "name", required = true) String name) {
        return "salam ana " + name;
    }
}
