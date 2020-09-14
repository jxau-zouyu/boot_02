package com.zy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("index","aaa11223");
        return "index";
    }

}
