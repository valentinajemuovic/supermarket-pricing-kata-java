package com.optivem.kata.hexarch.application;

import com.optivem.kata.hexarch.application.ports.primary.Discounting;
import com.optivem.kata.hexarch.application.ports.secondary.DiscountRateRepository;

public class App {

    private final DiscountRateRepository discountRateRepository;

    public App(DiscountRateRepository discountRateRepository) {
        this.discountRateRepository = discountRateRepository;
    }

    public Discounting getDiscounting() {
        return new DiscountingImpl(discountRateRepository);
    }
}
