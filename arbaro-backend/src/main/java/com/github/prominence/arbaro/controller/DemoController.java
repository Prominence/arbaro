package com.github.prominence.arbaro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.security.Principal;

@RestController
public class DemoController {

    @GetMapping("/")
    public Mono<String> index(Principal principal) {
        return Mono.just("Hello, " + principal.getName());
    }
}
