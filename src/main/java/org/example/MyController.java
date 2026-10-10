package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from БАС2402";
    }

    @GetMapping("/numbers")
    public String studentId() {
        return "1БАС24013";
    }
}