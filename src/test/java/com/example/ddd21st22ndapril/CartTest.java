package com.example.ddd21st22ndapril;

import com.example.ddd21st22ndapril.domain.Cart;
import com.example.ddd21st22ndapril.domain.Item;
import com.example.ddd21st22ndapril.domain.Product;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CartTest {

    @Test
    void shouldAddItemToCart() {
        var cart = new Cart();
        cart.add(anyItem());

        assertThat(cart.items().size()).isEqualTo(1);
    }

    @Test
    void shouldRemoveItemFromCart() {
        var cart = new Cart();
        cart.add(anyItem());
        cart.remove(anyProduct());

        assertThat(cart.items().size()).isEqualTo(0);
    }

    @Test
    void shouldHaveNoRemovedProductsFromCart() {
        var cart = new Cart();
        cart.add(anyItem());

        assertThat(cart.removedProducts().size()).isEqualTo(0);
    }

    @Test
    void shouldReturnRemovedProductsFromCart() {
        var cart = new Cart();
        cart.add(anyItem());
        cart.remove(anyProduct());

        assertThat(cart.removedProducts().size()).isEqualTo(1);
    }

    private Item anyItem() {
        return new Item(anyProduct());
    }

    private Product anyProduct() {
        return new Product("any product");
    }
}