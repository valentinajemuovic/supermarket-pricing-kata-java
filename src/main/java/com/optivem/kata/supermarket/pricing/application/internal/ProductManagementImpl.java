package com.optivem.kata.supermarket.pricing.application.internal;

import com.optivem.kata.supermarket.pricing.application.ports.*;

public class ProductManagementImpl implements ProductManagement {

    private ProductRepository productRepository;
    private DiscountRateRepository discountRateRepository;

    public ProductManagementImpl(ProductRepository productRepository, DiscountRateRepository discountRateRepository) {
        this.productRepository = productRepository;
        this.discountRateRepository = discountRateRepository;
    }

    @Override
    public void addProduct(String sku, double price) {
        var product = new Product(sku, price);
        productRepository.addProduct(product);
    }

    @Override
    public ProductDetails viewProduct(String sku) {
        var product = productRepository.getProduct(sku).get();
        var discountRate = discountRateRepository.getDiscountRate();

        var regularPrice = product.getPrice();
        var discountedPrice = regularPrice * discountRate;

        return new ProductDetails(sku, regularPrice, discountedPrice);
    }
}
