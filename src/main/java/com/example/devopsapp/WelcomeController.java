package com.example.devopsapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public String welcome(Model model){
        model.addAttribute("course", "This course will be really interesting");
        return "index";
    }

    @PostMapping("/{hello}")
    public String saveWelcome(@PathVariable("hello") String hello){

        System.out.println(hello);
        return "index";
    }


}
