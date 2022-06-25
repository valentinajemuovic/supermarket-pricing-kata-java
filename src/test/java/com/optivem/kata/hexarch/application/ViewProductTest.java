package com.optivem.kata.hexarch.application;

import com.optivem.kata.hexarch.application.common.BaseTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ViewProductTest extends BaseTest {

    @Test
    void should_view_product_given_valid_sku() {
        var sku = "ABC";
        var price = 100.0;
        var discountRate = 0.05;
        var expectedDiscountPrice = 5.0;

        givenThatRepositoryContainsProduct(sku, price);
        givenThatRepositoryHasDiscountRate(discountRate);

        var expectedProductDetails = new ProductDetails(sku, price, expectedDiscountPrice);

        var productDetails = app.getProductManagement().viewProduct(sku);

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
