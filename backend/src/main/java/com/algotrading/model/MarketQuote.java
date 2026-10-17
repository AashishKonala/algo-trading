package com.algotrading.model;
import java.time.Instant;

public class MarketQuote {

    private String symbol;
    private double price;
    private String source;
    private Instant timestamp;

    public MarketQuote(String symbol, double price, String source, Instant timestamp) {
        this.symbol = symbol;
        this.price = price;
        this.source = source;
        this.timestamp = timestamp;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }

    public String getSource() {
        return source;
    }

    public Instant getTimestamp() {
        return timestamp;
    }
}