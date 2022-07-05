package com.optivem.kata.supermarket.pricing.application.ports;

public interface SupermarketApp {
    ProductManagement getProductManagement();
    DiscountManagement getDiscountManagement();
}
