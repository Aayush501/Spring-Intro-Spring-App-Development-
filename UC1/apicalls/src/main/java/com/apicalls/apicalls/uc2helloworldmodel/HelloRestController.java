package com.apicalls.apicalls.uc2helloworldmodel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloRestController {
    @GetMapping("/hii")
    public String sayHello(Model model){
        model.addAttribute("message", "Hello From BridgeLabz!!!");
        return "Hello";
    }
}
