package com.algotrading.service;
import java.time.Instant;
import com.algotrading.model.MarketQuote;
import org.springframework.stereotype.Service;

@Service
public class MarketDataService {

    public MarketQuote getMarketPrice() {
        return new MarketQuote("NIFTY", 24500.0, "SIMULATED",Instant.now());
    }
}