package com.sridhar.pipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "messages")
public class MessageController {

    @GetMapping(value = "/greet/{name}")
    public String getMessage(@PathVariable String name){
        return "Hello, "+name +", Kubernetes is fun !!";
    }
}
