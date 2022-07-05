package com.optivem.kata.supermarket.pricing.application.internal;

import com.optivem.kata.supermarket.pricing.application.ports.*;

public class SupermarketApp implements ISupermarketApp {
    private final ProductRepository productRepository;
    private final DiscountRateRepository discountRateRepository;

    public SupermarketApp(ProductRepository productRepository, DiscountRateRepository discountRateRepository) {
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
