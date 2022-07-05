package com.optivem.kata.supermarket.pricing.application.internal;

import com.optivem.kata.supermarket.pricing.application.ports.DiscountManagement;
import com.optivem.kata.supermarket.pricing.application.ports.DiscountRateRepository;

public class DiscountManagementImpl implements DiscountManagement {
    private final DiscountRateRepository discountRateRepository;
    public DiscountManagementImpl(DiscountRateRepository discountRateRepository) {
        this.discountRateRepository = discountRateRepository;
    }

    @Override
    public void editDiscountRate(double discountRate) {
        discountRateRepository.setDiscountRate(discountRate);
    }
}
