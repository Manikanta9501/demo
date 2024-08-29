package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


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
    @PostMapping("/sampleposting/{post}")
    public String postMethodName(@PathVariable String post) {
        //TODO: process POST request
        
        return post.toUpperCase();
    }
    @GetMapping("/pathvariable/{msg1}")
    public String mes1(@PathVariable String msg)
    {
        return msg;
    }
    @GetMapping("/pathvariable/{testing}")
    public String testing(@PathVariable String msg)
    {
        return msg;
    }
}
