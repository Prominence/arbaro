package com.github.prominence.arbaro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
public class DemoController {

    @GetMapping("/")
    @ResponseBody
    public String index(Principal principal) {
        return "Hello, " + principal.getName();
    }
}
