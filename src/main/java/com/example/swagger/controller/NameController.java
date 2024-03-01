package com.example.swagger.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class NameController {

    @GetMapping("/name")
    public String getName(@RequestParam String name) {
        return name;
    }

    @PostMapping("/reverse-name")
    public String getReverseName(@RequestParam String name) {

        StringBuilder reversedString = new StringBuilder();
        reversedString.append(name);
        reversedString.reverse();

        return reversedString.toString();
    }
}