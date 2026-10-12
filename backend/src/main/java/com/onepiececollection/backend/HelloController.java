package com.onepiececollection.backend;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {
    
    @GetMapping("/")
    public String openingMessage() {
        return "One Piece Collection API is running!";
    }
    
}
