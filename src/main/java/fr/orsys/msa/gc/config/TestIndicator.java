package fr.orsys.msa.gc.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class TestIndicator implements HealthIndicator {
    @Override
    public Health health() {
        return Health.down().build();
    }
}
