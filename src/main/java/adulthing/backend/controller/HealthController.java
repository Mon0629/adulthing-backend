package adulthing.backend.controller;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import adulthing.backend.service.HealthService;

@RestController
public class HealthController {

    private final HealthService healthService;

    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping("/health")
    public Map<String, Object> health() {
        long total = healthService.getCount();
        return Map.of("status", "OK", "total", total);
    }
    
}
