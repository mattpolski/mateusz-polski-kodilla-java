package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent> continents = new ArrayList<>();

    BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.)
    }
}
