package com.optivem.kata.supermarket.pricing.application.common;

import com.optivem.kata.supermarket.pricing.adapters.FakeDiscountRateRepository;
import com.optivem.kata.supermarket.pricing.adapters.FakeProductRepository;
import com.optivem.kata.supermarket.pricing.application.ports.ISupermarketApp;
import com.optivem.kata.supermarket.pricing.application.internal.SupermarketApp;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    protected FakeProductRepository productRepository;
    protected FakeDiscountRateRepository discountRateRepository;
    protected ISupermarketApp supermarketApp;

    @BeforeEach
    protected void init() {
        productRepository = new FakeProductRepository();
        discountRateRepository = new FakeDiscountRateRepository();
        supermarketApp = new SupermarketApp(productRepository, discountRateRepository);
    }
}
