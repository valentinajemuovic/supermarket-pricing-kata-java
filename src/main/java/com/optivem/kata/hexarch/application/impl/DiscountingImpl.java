package com.optivem.kata.hexarch.application.impl;

import com.optivem.kata.hexarch.application.api.Discounting;
import com.optivem.kata.hexarch.application.spi.DiscountRateRepository;

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
