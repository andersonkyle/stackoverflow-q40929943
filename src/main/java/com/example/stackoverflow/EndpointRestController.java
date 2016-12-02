package com.example.stackoverflow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpointRestController {

    @GetMapping("/endpoint")
    public String get(){
        return "GET";
    }

    @PostMapping("/endpoint")
    public String post(){
        return "POST";
    }
}
