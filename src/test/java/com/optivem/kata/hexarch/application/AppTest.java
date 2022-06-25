package com.optivem.kata.hexarch.application;

import com.optivem.kata.hexarch.adapters.FakeDiscountRateRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {
    private FakeDiscountRateRepository rateRepository;
    private App app;

    private static Stream<Arguments> should_calculate_discount_given_positive_amount() {
        return Stream.of(Arguments.of(100.0, 0.05, 5.0),
                Arguments.of(100.0, 0.20, 20.0));
    }

    @BeforeEach
    private void init() {
        rateRepository = new FakeDiscountRateRepository();
        app = new App(rateRepository);
    }

    @ParameterizedTest
    @MethodSource
    void should_calculate_discount_given_positive_amount(double amount, double discountRate, double expectedDiscountedAmount) {
        rateRepository.setDiscountRate(discountRate);
        var discountedAmount = app.getDiscounting().calculateDiscountedAmount(amount);
        assertThat(discountedAmount).isEqualTo(expectedDiscountedAmount);
    }
}
