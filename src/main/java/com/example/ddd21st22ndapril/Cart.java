package com.example.ddd21st22ndapril;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Item> products;

    public Cart(){
        this.products = new ArrayList<>();
    }

    public void add(Item product){
        this.products.add(product);
    }
}
