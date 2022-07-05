package com.optivem.kata.supermarket.pricing.application.ports;

public interface DiscountRateRepository {
    double getDiscountRate();
    void setDiscountRate(double discountRate);
}
