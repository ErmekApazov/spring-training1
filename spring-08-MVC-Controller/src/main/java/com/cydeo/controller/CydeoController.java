package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CydeoController {

    @RequestMapping("/save") // it can be any name, as long as word save entered correctly on browser
    public String register(){
        return "cydeo/register.html";
    }
}
