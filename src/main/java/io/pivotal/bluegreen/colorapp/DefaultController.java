package io.pivotal.bluegreen.colorapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("/")
    public String getDefaultPage(Model model){
        model.addAttribute("version", "2");
        model.addAttribute("bgcolor", "green");
        return "index";
    }

    @GetMapping("/errors/throw")
    public String getThrow(){
        throw new RuntimeException("This is a test");
    }

    @GetMapping("/errors/kill")
    public void getKill(){
        System.exit(-1);
    }
}
