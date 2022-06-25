package com.optivem.kata.hexarch.application;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationTest {
    private Application application;

    private static Stream<Arguments> should_calculate_discount_given_positive_amount() {
        return Stream.of(Arguments.of(100.0, 5.0));
    }

    @BeforeEach
    private void init() {
        application = new Application();
    }

    @ParameterizedTest
    @MethodSource
    void should_calculate_discount_given_positive_amount(double amount, double expectedDiscountedAmount) {
        var discountedAmount = application.calculateDiscount(amount);
        assertThat(discountedAmount).isEqualTo(expectedDiscountedAmount);
    }
}
