package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class LoginController {


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String update(@RequestParam(name="name", required=false, defaultValue="unknown") String name,
                        @RequestParam("password") String password,
                        Model model) {
      System.out.println("<<<<<<<<<<<<<<<<<login initiated>>>>>>>>>>>>>>>>");
      System.out.println("Login with name: " + name + " password: " + password);
      User user = new User(name, password);
      System.out.println("<<<<<<<<<<<<<<<<<login successful>>>>>>>>>>>>>>>>");
      model.addAttribute("user", user);
      return "forward:home";
    }
}
