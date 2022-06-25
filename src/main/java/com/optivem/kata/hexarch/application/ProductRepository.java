package com.optivem.kata.hexarch.application;

import java.util.Optional;

public interface ProductRepository {
    Optional<Product> getProduct(String sku);

    void addProduct(Product product);
}
