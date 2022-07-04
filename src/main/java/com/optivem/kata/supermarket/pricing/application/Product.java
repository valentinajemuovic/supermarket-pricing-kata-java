package com.optivem.kata.supermarket.pricing.application;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product {
    private String sku;
    private double price;
}
