package com.example.ddd21st22ndapril.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Item> items;

    public Cart(){
        this.items = new ArrayList<>();
    }

    public void add(Item product){
        this.items.add(product);
    }

    public List<Item> items(){
        return items;
    }

    public void remove(Product productToBeRemoved) {
        this.items.remove(items.stream().filter(item  -> item.product().
                equals(productToBeRemoved)).findFirst().get());
    }
}
