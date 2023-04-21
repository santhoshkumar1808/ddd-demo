package com.example.ddd21st22ndapril.domain;

import java.util.Currency;
import java.util.Objects;

public class Price {
    private final Double value;
    private final Currency currency;

    public Price(Double value) {
        this.value = value;
        this.currency = Currency.getInstance("USD");
    }

    public Double reduceBy(Integer number) {
        return this.value - (this.value * number / 100);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return Objects.equals(value, price.value) && Objects.equals(currency, price.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, currency);
    }
}
