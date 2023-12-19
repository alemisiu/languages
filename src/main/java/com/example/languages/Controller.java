package com.example.languages;

import java.util.Locale;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/welcome")
    public String welcome(Model model, Locale locale) {
        model.addAttribute("locale", locale);
        return "index";
    }

}
