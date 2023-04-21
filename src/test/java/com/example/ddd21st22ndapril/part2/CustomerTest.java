package com.example.ddd21st22ndapril.part2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CustomerTest {

    @Test
    void shouldUpdateAllAddressForCustomer() {
        Customer customer = new Customer(anyAddress(), List.of(anyAccount(), anyAccount()));

        Address newAddress = new Address("new city");
        customer.updateAddress(newAddress);

        assertThat(customer.allAccountAddresses()).containsExactly(newAddress, newAddress);
    }

    private Account anyAccount() {
        return new Account(anyAddress());
    }

    private Address anyAddress() {
        return new Address("Pune");
    }
}