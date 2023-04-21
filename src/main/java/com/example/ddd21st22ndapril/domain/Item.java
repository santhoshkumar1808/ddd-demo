package com.example.ddd21st22ndapril.domain;

import java.util.Objects;

public class Item {
    private final Product product;
    private final Integer quantity;

    public Item(Product product, Integer quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public Item(Product product){
        this.product = product;
        this.quantity = 1;
    }

    public boolean hasProduct(Product anotherProduct){
        return product.equals(anotherProduct);
    }

    public Product product(){
        return product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(product, item.product) && Objects.equals(quantity, item.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, quantity);
    }
}
