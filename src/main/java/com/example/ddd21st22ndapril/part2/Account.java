package com.example.ddd21st22ndapril.part2;

public class Account {
    private Address address;

    public Account(Address address) {
        this.address = address;
    }

    public void updateAddress(Address address) {
      this.address = address;
    }

    public Address address() {
        return this.address;
    }
}
