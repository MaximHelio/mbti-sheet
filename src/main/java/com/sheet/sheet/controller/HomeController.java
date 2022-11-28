package com.sheet.sheet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", ""})
    public String home(Model model) throws Exception{

        model.addAttribute("welcome", "안녕하세요");

        return "index";
    }

}
