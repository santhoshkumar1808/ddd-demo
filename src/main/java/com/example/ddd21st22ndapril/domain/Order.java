package com.example.ddd21st22ndapril.domain;

import java.util.List;

public class Order {
    private final List<Product> products;

    public Order(List<Product> products) {
        this.products = products;
    }

    public List<Product> products() {
        return products;
    }
}
