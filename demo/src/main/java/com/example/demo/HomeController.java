package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


// right now it is rendering both pages and the home page is being dislayed without the data


  @GetMapping("/home")
  public String home(Model model){
    // User user = new User("test", "data");
    // model.addAttribute("user", user.getHashMap());
    return "home";
  }

  @RequestMapping("/home")
  public String home(@RequestParam(name="name", required=false, defaultValue="unknown") String name,
                      @RequestParam("password") String password,
                      Model model) {
    User user = new User(name, password);
    model.addAttribute("user", user.getHashMap());
    return "home";
  }

}
