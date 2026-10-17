package com.algotrading.controller;

import com.algotrading.model.MarketQuote;
import com.algotrading.service.MarketDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketDataController {

    private final MarketDataService marketDataService;

    public MarketDataController(MarketDataService marketDataService) {
        this.marketDataService = marketDataService;
    }

    @GetMapping("/api/market/price")
    public MarketQuote getMarketPrice() {
        return marketDataService.getMarketPrice();
    }
}