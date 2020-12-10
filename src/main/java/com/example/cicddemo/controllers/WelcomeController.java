package com.example.cicddemo.controllers;

import com.example.cicddemo.services.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @Autowired
    private WelcomeService welcomeService;

    @RequestMapping("/{name}")
    public String home(@PathVariable("name") String name) {
        return welcomeService.getMessage(name);
    }

    @RequestMapping("/welcome/{name}")
    public String welcome(@PathVariable("name") String name) {
        return welcomeService.getMessage(name);
    }
}
