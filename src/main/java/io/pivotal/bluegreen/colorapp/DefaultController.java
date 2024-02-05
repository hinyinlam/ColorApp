package io.pivotal.bluegreen.colorapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @Autowired
    Environment env;

    @GetMapping("/")
    public String getDefaultPage(Model model){
        model.addAttribute("version", env.getProperty("colorapp.display.version","N/A"));
        model.addAttribute("bgcolor", env.getProperty("colorapp.display.bgcolor","white"));
        model.addAttribute("instanceid", env.getProperty("CF_INSTANCE_INDEX"));
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
