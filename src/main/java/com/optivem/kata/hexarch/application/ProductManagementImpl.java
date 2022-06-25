package com.optivem.kata.hexarch.application;

public class ProductManagementImpl implements ProductManagement {

    private ProductRepository productRepository;

    public ProductManagementImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void addProduct(String sku, double price) {
        var product = new Product(sku, price);
        productRepository.addProduct(product);
    }
}
