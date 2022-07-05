package com.optivem.kata.supermarket.pricing.application.internal;

import com.optivem.kata.supermarket.pricing.application.ports.*;

public class SupermarketAppImpl implements SupermarketApp {
    private final ProductManagement productManagement;
    private final DiscountManagement discountManagement;

    public SupermarketAppImpl(ProductRepository productRepository, DiscountRateRepository discountRateRepository) {
        this.productManagement = new ProductManagementImpl(productRepository, discountRateRepository);
        this.discountManagement = new DiscountManagementImpl(discountRateRepository);
    }

    public ProductManagement getProductManagement() {
        return productManagement;
    }

    public DiscountManagement getDiscountManagement() {
        return discountManagement;
    }
}
