package com.optivem.kata.supermarket.pricing.application;

import com.optivem.kata.supermarket.pricing.adapters.FakeDiscountRateRepository;
import com.optivem.kata.supermarket.pricing.adapters.FakeProductRepository;
import com.optivem.kata.supermarket.pricing.application.common.BaseTest;
import com.optivem.kata.supermarket.pricing.application.internal.SupermarketAppImpl;
import com.optivem.kata.supermarket.pricing.application.ports.Product;
import com.optivem.kata.supermarket.pricing.application.ports.ProductDetails;
import com.optivem.kata.supermarket.pricing.application.ports.SupermarketApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ViewProductDetailsTest {
    private FakeProductRepository productRepository;
    private FakeDiscountRateRepository discountRateRepository;
    private SupermarketApp supermarketApp;

    @BeforeEach
    protected void init() {
        productRepository = new FakeProductRepository();
        discountRateRepository = new FakeDiscountRateRepository();
        supermarketApp = new SupermarketAppImpl(productRepository, discountRateRepository);
    }

    @Test
    void should_view_product_details_given_valid_sku() {
        var sku = "ABC";
        var price = 100.0;
        var discountRate = 0.05;
        var expectedDiscountPrice = 95.00;

        givenThatRepositoryContainsProduct(sku, price);
        givenThatRepositoryHasDiscountRate(discountRate);

        var expectedProductDetails = new ProductDetails(sku, price, expectedDiscountPrice);

        var productDetails = supermarketApp.getProductManagement().viewProductDetails(sku);

        assertThat(productDetails).isEqualTo(expectedProductDetails);
    }

    private void givenThatRepositoryContainsProduct(String sku, double price) {
        var product = new Product(sku, price);
        productRepository.addProduct(product);
    }

    private void givenThatRepositoryHasDiscountRate(double discountRate) {
        discountRateRepository.setDiscountRate(discountRate);
    }
}
