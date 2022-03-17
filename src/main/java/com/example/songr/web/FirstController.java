package com.example.songr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hello")
    String hello(){
        System.out.println("hello");
        return "hello";
    }
}
