package com.simpleApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/greeting")
    public String greeting(String name, Model model) {
        name = "hhbbz" ;
        model.addAttribute("name", name);
        return "hello";
    }
    
}
