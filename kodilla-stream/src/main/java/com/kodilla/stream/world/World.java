package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    public final List<Continent> continent = new ArrayList<>();

    public World() {
    }

    public List<Continent> getContinentList() {
        return continent;
    }

    public BigDecimal getPeopleQuantity() {
        return continent.stream()
                .flatMap(continent -> continent.getCountry().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
