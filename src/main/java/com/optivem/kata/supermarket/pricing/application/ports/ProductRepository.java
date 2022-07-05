package com.optivem.kata.supermarket.pricing.application.ports;

import java.util.Optional;

public interface ProductRepository {
    Optional<Product> getProduct(String sku);

    void addProduct(Product product);
}
