package com.optivem.kata.hexarch.application;

public class App {
    private final ProductRepository productRepository;
    private final DiscountRateRepository discountRateRepository;

    public App(ProductRepository productRepository, DiscountRateRepository discountRateRepository) {
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
