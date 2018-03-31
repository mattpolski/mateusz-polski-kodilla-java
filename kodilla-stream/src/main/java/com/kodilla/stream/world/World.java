package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }
    List<Continent> continentList = new ArrayList<>();

    BigDecimal getPeopleQuantity() {
        return continentList.stream()
                .flatMap(continent -> )
    }
}
