package com.example.ddd21st22ndapril.domain;

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
}
