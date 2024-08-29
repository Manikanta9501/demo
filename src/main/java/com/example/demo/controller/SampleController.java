package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class SampleController {

    @GetMapping("/sample")
    public String getHi()
    {
        return "Hihu";
        
    }
    @GetMapping("/pathvariable/{msg}")
    public String mes(@PathVariable String msg)
    {
        return msg;
    }
}
