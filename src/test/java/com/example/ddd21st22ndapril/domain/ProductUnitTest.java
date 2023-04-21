package com.example.ddd21st22ndapril.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProductUnitTest {

    @Test
    void shouldEquateTwoProductsHavingSameName() {
        Product product = new Product("product 1", anyPrice());
        Product otherProduct = new Product("product 1", anyPrice());

        assertThat(product).isEqualTo(otherProduct);
    }

    @Test
    void shouldNotEquateTwoProductsHavingSameNameInDifferentCases() {
        Product product = new Product("PRoDuCT 1", anyPrice());
        Product otherProduct = new Product("product 1", anyPrice());

        assertThat(product).isNotEqualTo(otherProduct);
    }

    @Test
    void shouldNotEquateDifferentProducts() {
        Product product = new Product("product 1", anyPrice());
        Product otherProduct = new Product("product 2", anyPrice());

        assertThat(product).isNotEqualTo(otherProduct);
    }


    private Price anyPrice() {
        return new Price(10.00);
    }
}