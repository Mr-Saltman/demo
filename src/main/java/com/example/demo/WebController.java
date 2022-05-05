package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
class WebController {

    String message = "";
    boolean status = true;

    @RequestMapping(value = "/")
    public String index(Model model){
        model.addAttribute("message", this.message);
        model.addAttribute("time", java.time.LocalTime.now());
        model.addAttribute("status", this.status);
        return "index";
    }

    @GetMapping(value = "/setMessage/{msg}")
    public @ResponseBody String setMessage(@PathVariable String msg){
        this.message = msg;
        return "Message has been set to: " + this.message;
    }

    @GetMapping(value ="/getMessage")
    public @ResponseBody String getMessage(){
        return this.message;
    }

    @GetMapping(value = "/reset")
    public @ResponseBody String resetMessage(){
        this.message = "";
        return "Message has been reset.";
    }

    @GetMapping(value = "/status")
    public @ResponseBody String changeStatus(){
        this.status = !this.status;
        return "Status has been set to: " + status;
    }
}
