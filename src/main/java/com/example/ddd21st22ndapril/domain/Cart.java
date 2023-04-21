package com.example.ddd21st22ndapril.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Item> items;
    private List<Product> removedProducts;

    public Cart(){
        this.items = new ArrayList<>();
        this.removedProducts = new ArrayList<>();
    }

    public void add(Item product){
        this.items.add(product);
    }

    public void remove(Product productToBeRemoved) {
        this.items.remove(items.stream().filter(item  -> item.hasProduct(productToBeRemoved)).findFirst().get());
        this.removedProducts.add(productToBeRemoved);
    }

    public List<Product> removedProducts() {
        return this.removedProducts;
    }

    Integer itemsQuantity(){
        return items.size();
    }
}
