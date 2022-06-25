package com.optivem.kata.hexarch.application;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ProductDetails {
    private String sku;
    private double regularPrice;
    private double discountedPrice;
}
