package com.apicalls.apicalls.uc2helloworldmodel;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @GetMapping("/hii")
    public String sayHello(Model model){
        return "Hello From BridgeLabz!!!";
    }
}
