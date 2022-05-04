package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    Boolean status;
    String message;

    @GetMapping("/getMessage")
    public String defaultResponse(){
        return this.message;
    }

    @GetMapping("/reset")
    public String resetMessage(){
        this.message = "";
        return "Message has been reset.";
    }

    @GetMapping("/setMessage/{msg}")
    public String setMessage(@PathVariable String msg){
        this.message = msg;
        return "Message has been set to: " + this.message;
    }
}
