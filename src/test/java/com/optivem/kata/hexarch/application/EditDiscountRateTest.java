package com.optivem.kata.hexarch.application;

import com.optivem.kata.hexarch.application.common.BaseTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EditDiscountRateTest extends BaseTest {
    @Test
    void should_edit_discount_rate_given_valid_data() {
        var discountRate = 0.06;

        app.getDiscountManagement().editDiscountRate(discountRate);

        var retrievedDiscountRate = discountRateRepository.getDiscountRate();
        assertThat(retrievedDiscountRate).isEqualTo(discountRate);
    }
}
