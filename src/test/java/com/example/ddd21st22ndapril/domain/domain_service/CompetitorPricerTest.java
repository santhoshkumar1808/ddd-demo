package com.example.ddd21st22ndapril.domain.domain_service;

import com.example.ddd21st22ndapril.domain.Price;
import com.example.ddd21st22ndapril.domain.Product;
import com.example.ddd21st22ndapril.domain.domain_service.CompetitorPricer;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CompetitorPricerTest {

    @Test
    void shouldSetPriceAsTenPercentOfCompetitorPrice() {
        Price discountPrice = new CompetitorPricer().discountPriceFromCompetitorPriceFor("any product");

        Product product = new Product("product 1", discountPrice);

        Price expectedDiscountedPrice = new Price(9.0);
        assertThat(product.price()).isEqualTo(expectedDiscountedPrice);
    }
}