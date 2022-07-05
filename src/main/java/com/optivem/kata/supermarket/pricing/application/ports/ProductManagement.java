package com.optivem.kata.supermarket.pricing.application.ports;

public interface ProductManagement {
    void addProduct(String sku, double price);

    ProductDetails viewProductDetails(String sku);
}
