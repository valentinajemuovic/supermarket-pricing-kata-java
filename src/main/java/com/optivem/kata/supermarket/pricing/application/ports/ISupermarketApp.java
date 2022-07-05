package com.optivem.kata.supermarket.pricing.application.ports;

import com.optivem.kata.supermarket.pricing.application.ports.DiscountManagement;
import com.optivem.kata.supermarket.pricing.application.ports.ProductManagement;

public interface ISupermarketApp {
    ProductManagement getProductManagement();
    DiscountManagement getDiscountManagement();
}
