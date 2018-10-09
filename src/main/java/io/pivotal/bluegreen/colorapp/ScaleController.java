package io.pivotal.bluegreen.colorapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hinlam on 2/11/2017.
 */
@RestController
public class ScaleController {
    private static final Logger logger = LoggerFactory.getLogger(ScaleController.class);

    @RequestMapping(value = "/loadtest")
    @ResponseBody
    public String loadtest() {
        logger.info("Forcing application to run CPU intensive work");
        for (int thread = 0; thread < 10; thread++) {
            new BusyThread("Thread" + thread, 0.8,  60000).start();
        }
        return "It is generating load now, please visit AppManager for AutoScaling settings";
    }

}

class BusyThread extends Thread {
    private double load;
    private long duration;

    /**
     * Constructor which creates the thread
     * @param name Name of this thread
     * @param load Load % that this thread should generate
     * @param duration Duration that this thread should generate the load for
     */
    public BusyThread(String name, double load, long duration) {
        super(name);
        this.load = load;
        this.duration = duration;
    }

    /**
     * Generates the load when run
     */
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        try {
            // Loop for the given duration
            while ((System.currentTimeMillis() - startTime) < duration) {
                // Every 100ms, sleep for the percentage of unladen time
                if (System.currentTimeMillis() % 100 == 0) {
                    Thread.sleep((long) Math.floor((1 - load) * 100));
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
