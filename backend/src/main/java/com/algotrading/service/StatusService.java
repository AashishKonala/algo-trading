
package com.algotrading.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class StatusService {

    public Map<String, String> getStatus() {
        return Map.of(
            "application", "Algo Trading Backend",
            "market", "NIFTY",
            "mode", "PAPER",
            "status", "RUNNING"
        );
    }
}
