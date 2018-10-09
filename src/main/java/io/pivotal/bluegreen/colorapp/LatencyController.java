package io.pivotal.bluegreen.colorapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/latency")
public class LatencyController {

    @GetMapping("/{seconds}")
    public String getDelayedResponse(@PathVariable int seconds){
        Long milliSec = Long.valueOf(seconds )*1000;
        try {
            Thread.sleep(milliSec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Waited: " + seconds + " seconds!";
    }
}
