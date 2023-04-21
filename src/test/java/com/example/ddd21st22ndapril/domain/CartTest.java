package com.example.ddd21st22ndapril.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CartTest {

    @Test
    void shouldAddItemToCart() {
        var cart = new Cart();
        cart.add(anyItem());

        assertThat(cart.itemsQuantity()).isEqualTo(1);
    }

    @Test
    void shouldRemoveItemFromCart() {
        var cart = new Cart();
        cart.add(anyItem());
        cart.remove(anyProduct());

        assertThat(cart.itemsQuantity()).isEqualTo(0);
    }

    @Test
    void shouldHaveNoRemovedProductsFromCart() {
        var cart = new Cart();
        cart.add(anyItem());

        assertThat(cart.removedProducts()).hasSize(0);
    }

    @Test
    void shouldHaveNoRemovedProductsFromCartAfterAddingTheSameProductAgain() {
        var cart = new Cart();
        cart.add(anyItem());
        cart.remove(anyProduct());
        cart.add(anyItem());

        assertThat(cart.removedProducts()).hasSize(0);
    }

    @Test
    void shouldReturnRemovedProductsFromCart() {
        var cart = new Cart();
        cart.add(anyItem());
        cart.remove(anyProduct());

        assertThat(cart.removedProducts()).hasSize(1);
    }

    @Test
    void shouldNotEquateTwoCartsHavingSameItems() {
        var cart = new Cart();
        var anotherCart = new Cart();
        cart.add(anyItem());
        anotherCart.add(anyItem());

        assertThat(cart).isNotEqualTo(anotherCart);
    }

    @Test
    void shouldReturnOrderWhenCartIsCheckedOut() {
        var cart = new Cart();
        cart.add(anyItemWithQuantity(3));

        Order checkedOutOrder = cart.checkout();

        assertThat(checkedOutOrder.products()).containsExactly(anyProduct(), anyProduct(), anyProduct());
    }

    private Item anyItemWithQuantity(Integer quantity) {
        return new Item(anyProduct(), quantity);
    }


    private Item anyItem() {
        return new Item(anyProduct());
    }

    private Product anyProduct() {
        return new Product("any product", new Price(10.00));
    }
}