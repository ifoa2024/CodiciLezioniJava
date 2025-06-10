package it.ifoa.progettofinaleifoa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AuthController {

    @GetMapping
    public String login(Model viewModel){
        viewModel.addAttribute("title", "Login");
        return "login";
    }

}
