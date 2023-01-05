package com.org.covidapp.controller;

import com.org.covidapp.model.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
//        return "redirect:/Login.html";
        return "redirect:/title.jsp";
    }
    @PostMapping("/loginsubmit")
    public String login(@ModelAttribute LoginForm loginForm) {
        String username = loginForm.getUsername();
        String password = loginForm.getPassword();

        if (username.equalsIgnoreCase("surya") && password.equalsIgnoreCase("surya123")) {
            return "redirect:/Welcome.html";
        }

        return "redirect:/Login.html";
    }

}