package com.example.test.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopController {

    @GetMapping("/login")
    public String login(@ModelAttribute TestForm testForm) {

        return "login";
    }

    @RequestMapping("/login-fail")
    public String loginFail(@ModelAttribute TestForm testForm) {

        return "login";
    }
}