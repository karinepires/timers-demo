package com.example.demo;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class RandomHealthIndicator implements HealthIndicator {

    private Health health = Health.up().build();

    @Override
    public Health health() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }
}