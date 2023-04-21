package com.example.ddd21st22ndapril.part2;

import java.util.List;
import java.util.stream.Collectors;

public class Customer {
    private Address address;
    private List<Account> accounts;

    public Customer(Address address, List<Account> accounts) {
        this.address = address;
        this.accounts = accounts;
    }

    public void updateAddress(Address newAddress) {
        this.address = newAddress;
        this.accounts
                .forEach(account -> account.updateAddress(newAddress));
        // it is okay to have it here, you can update all its account addresses
    }

    List<Address> allAccountAddresses() {
        return this.accounts.stream().map(account -> account.address()).collect(Collectors.toList());
    }
}

