package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String countryName;
    private final BigDecimal peopleQnt;

    public Country(final String countryName, final BigDecimal peopleQnt) {
        this.countryName = countryName;
        this.peopleQnt = peopleQnt;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQnt;
    }
}

