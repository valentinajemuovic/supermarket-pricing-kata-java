package com.optivem.kata.hexarch.application.common;

import com.optivem.kata.hexarch.adapters.FakeDiscountRateRepository;
import com.optivem.kata.hexarch.adapters.FakeProductRepository;
import com.optivem.kata.hexarch.application.ISupermarketApp;
import com.optivem.kata.hexarch.application.SupermarketApp;
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
