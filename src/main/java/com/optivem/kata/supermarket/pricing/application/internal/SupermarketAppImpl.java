package com.optivem.kata.supermarket.pricing.application.internal;

import com.optivem.kata.supermarket.pricing.application.ports.*;

public class SupermarketAppImpl implements com.optivem.kata.supermarket.pricing.application.ports.SupermarketApp {
    private final ProductRepository productRepository;
    private final DiscountRateRepository discountRateRepository;

    public SupermarketAppImpl(ProductRepository productRepository, DiscountRateRepository discountRateRepository) {
        this.productRepository = productRepository;
        this.discountRateRepository = discountRateRepository;
    }

    public ProductManagement getProductManagement() {
        return new ProductManagementImpl(productRepository, discountRateRepository);
    }

    public DiscountManagement getDiscountManagement() {
        return new DiscountManagementImpl(discountRateRepository);
    }
}
