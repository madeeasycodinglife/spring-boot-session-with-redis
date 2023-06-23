package com.madeeasy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class RedisController {

    @GetMapping("/")
    public String index(Principal principal) {
        return "Hello Mr " + principal.getName();
    }
}
