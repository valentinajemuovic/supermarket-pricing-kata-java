package com.optivem.kata.hexarch.application;

public interface ProductManagement {
    void addProduct(String sku, double price);

    ProductDetails viewProduct(String sku);
}
