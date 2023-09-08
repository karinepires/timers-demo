package com.example.demo;

import org.springframework.boot.actuate.health.Health;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Actions {

    private RandomHealthIndicator randomHealthIndicator;

    public Actions(RandomHealthIndicator randomHealthIndicator) {
        this.randomHealthIndicator = randomHealthIndicator;
    }

    @GetMapping("/down")
    void goDown(){
    randomHealthIndicator.setHealth(Health.down().build());
    }

    @GetMapping("/up")
    void goUp(){
        randomHealthIndicator.setHealth(Health.up().build());

    }
}
