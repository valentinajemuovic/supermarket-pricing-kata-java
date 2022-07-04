package com.optivem.kata.supermarket.pricing.application;

public interface ProductManagement {
    void addProduct(String sku, double price);

    ProductDetails viewProduct(String sku);
}
