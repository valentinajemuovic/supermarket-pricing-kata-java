package com.optivem.kata.hexarch.application;

import com.optivem.kata.hexarch.application.api.Discounting;
import com.optivem.kata.hexarch.application.impl.DiscountingImpl;
import com.optivem.kata.hexarch.application.spi.DiscountRateRepository;

public class App {

    private final DiscountRateRepository discountRateRepository;

    public App(DiscountRateRepository discountRateRepository) {
        this.discountRateRepository = discountRateRepository;
    }

    public Discounting getDiscounting() {
        return new DiscountingImpl(discountRateRepository);
    }
}
