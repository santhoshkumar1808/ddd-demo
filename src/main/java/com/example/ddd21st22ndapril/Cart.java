package com.example.ddd21st22ndapril;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> products;

    public Cart(){
        this.products = new ArrayList<>();
    }

    public void add(Product product){
        this.products.add(product);
    }
}
