package com.optivem.kata.hexarch.application;

import com.optivem.kata.hexarch.application.ports.primary.Discounting;
import com.optivem.kata.hexarch.application.ports.secondary.DiscountRateRepository;

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
