package io.pivotal.bluegreen.colorapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("/")
    public String getDefaultPage(Model model){
        model.addAttribute("version", "1");
        model.addAttribute("bgcolor", "blue");
        return "index";
    }
}
