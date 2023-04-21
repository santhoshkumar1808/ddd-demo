package com.example.ddd21st22ndapril;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Ddd21st22ndAprilApplication {

    public static void main(String[] args) {
        var cart = new Cart();
        cart.add(new Product("Apple pencil"));
    }

}
