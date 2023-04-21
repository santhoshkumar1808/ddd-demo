package com.example.ddd21st22ndapril;

import com.example.ddd21st22ndapril.domain.Cart;
import com.example.ddd21st22ndapril.domain.Item;
import com.example.ddd21st22ndapril.domain.Product;

public class Ddd21st22ndAprilApplication {

    public static void main(String[] args) {
        var cart = new Cart();
        cart.add(new Item(new Product("Apple pencil"), 2));
        cart.add(new Item(new Product("Sony Wireless headphone")));
    }

}
