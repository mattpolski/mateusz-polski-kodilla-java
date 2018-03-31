package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal population = continents.stream()
                .flatMap(continents -> continents.getListOfCountries().stream())
                        .map(country -> country.getPeopleQuantity())
                                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return population;
    }

}
