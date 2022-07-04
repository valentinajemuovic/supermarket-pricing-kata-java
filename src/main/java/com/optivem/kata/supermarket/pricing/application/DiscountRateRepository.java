package com.optivem.kata.supermarket.pricing.application;

public interface DiscountRateRepository {
    double getDiscountRate();
    void setDiscountRate(double discountRate);
}
