
package com.algotrading.controller;

import java.util.Map;

import com.algotrading.service.StatusService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    private final StatusService statusService;

    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    @GetMapping("/api/status")
    public Map<String, String> status() {
        return statusService.getStatus();
    }
}
