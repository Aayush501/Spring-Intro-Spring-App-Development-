package com.apicalls.apicalls.uc1helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello From BridgeLabz!!!";
    }
}
