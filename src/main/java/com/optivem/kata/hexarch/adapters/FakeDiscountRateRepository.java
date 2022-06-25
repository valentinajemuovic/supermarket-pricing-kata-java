package com.optivem.kata.hexarch.adapters;

import com.optivem.kata.hexarch.application.DiscountRateRepository;

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
