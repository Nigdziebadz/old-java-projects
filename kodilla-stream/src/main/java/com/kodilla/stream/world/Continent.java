package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final List<Country> country = new ArrayList<>();

    public Continent() {
    }

    public List<Country> getCountry() {
        return country;
    }
}
