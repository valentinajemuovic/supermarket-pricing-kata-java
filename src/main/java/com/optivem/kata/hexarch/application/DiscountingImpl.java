package com.optivem.kata.hexarch.application;

public class DiscountingImpl implements Discounting {
    private DiscountRateRepository discountRateRepository;

    public DiscountingImpl(DiscountRateRepository discountRateRepository) {
        this.discountRateRepository = discountRateRepository;
    }

    @Override
    public double calculateDiscountedAmount(double amount) {
        var discountRate = discountRateRepository.getDiscountRate();
        return amount * discountRate;
    }
}
