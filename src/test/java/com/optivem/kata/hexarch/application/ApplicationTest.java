package com.optivem.kata.hexarch.application;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationTest {
    private Application application;

    @BeforeEach
    private void init() {
        application = new Application();
    }

    @Test
    void should_calculate_discount_given_positive_amount() {
        var amount = 100.0;
        var discountedAmount = application.calculateDiscount(amount);
        assertThat(discountedAmount).isEqualTo(5);
    }
}
