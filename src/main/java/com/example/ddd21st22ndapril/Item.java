package com.example.ddd21st22ndapril;

public class Item {
    private Product product;
    private Integer quantity;

    public Item(Product product, Integer quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public Item(Product product){
        this.product = product;
        this.quantity = 1;
    }
}
