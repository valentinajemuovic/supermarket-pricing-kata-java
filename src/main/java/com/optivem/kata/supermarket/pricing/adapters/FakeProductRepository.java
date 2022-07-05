package com.optivem.kata.supermarket.pricing.adapters;

import com.optivem.kata.supermarket.pricing.application.ports.Product;
import com.optivem.kata.supermarket.pricing.application.ports.ProductRepository;

import java.util.HashMap;
import java.util.Optional;

public class FakeProductRepository implements ProductRepository {
    private HashMap<String, Product> products;

    public FakeProductRepository() {
        this.products = new HashMap<>();
    }

    @Override
    public void addProduct(Product product) {
        var sku = product.getSku();
        products.put(sku, product);
    }

    @Override
    public Optional<Product> getProduct(String sku) {
        var product = products.get(sku);
        return Optional.of(product);
    }
}
