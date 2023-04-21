package com.example.ddd21st22ndapril.domain.domain_service;

import com.example.ddd21st22ndapril.domain.Price;
import com.example.ddd21st22ndapril.domain.Product;

import java.util.List;

public class CompetitorPricer {

    private static final int DISCOUNT_PERCENTAGE = 10;
    private final List<Product> competitorProducts;

    public CompetitorPricer() {
        this.competitorProducts = List.of(new Product("any product", new Price(10.00)));
    }

    public Price discountPriceFromCompetitorPriceFor(String productName) {
        return this.competitorProducts.stream().filter(product -> product.name().equals(productName))
                .map(foundProduct -> new Price(foundProduct.price().reduceBy(DISCOUNT_PERCENTAGE))).findFirst().get();
    }
}
