package com.example.ddd21st22ndapril.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProductUnitTest {

    @Test
    void shouldEquateTwoProductsHavingSameName() {
        Product product = new Product("product 1", discountPrice());
        Product otherProduct = new Product("product 1", discountPrice());

        assertThat(product).isEqualTo(otherProduct);
    }

    @Test
    void shouldNotEquateTwoProductsHavingSameNameInDifferentCases() {
        Product product = new Product("PRoDuCT 1", discountPrice());
        Product otherProduct = new Product("product 1", discountPrice());

        assertThat(product).isNotEqualTo(otherProduct);
    }

    @Test
    void shouldNotEquateDifferentProducts() {
        Product product = new Product("product 1", discountPrice());
        Product otherProduct = new Product("product 2", discountPrice());

        assertThat(product).isNotEqualTo(otherProduct);
    }


    private Price discountPrice() {
        return new Price(10.00);
    }
}