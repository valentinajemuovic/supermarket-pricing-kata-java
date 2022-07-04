package com.optivem.kata.supermarket.pricing.application;

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
