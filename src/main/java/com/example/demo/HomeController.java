package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalTime;

@Controller
@RequestMapping("/")
class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("msg", "Hello CLB!");
        model.addAttribute("time", LocalTime.now().toString());
        model.addAttribute("bgColor", System.getenv("bg_color"));
        return "home";
    }
}
