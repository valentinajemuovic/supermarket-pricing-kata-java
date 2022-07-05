package com.optivem.kata.supermarket.pricing.adapters;

import com.optivem.kata.supermarket.pricing.application.ports.DiscountRateRepository;

public class FakeDiscountRateRepository implements DiscountRateRepository {
    private double discountRate;

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }
}
