package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final List<Country> europe = new ArrayList<>();
    private final List<Country> southAmerica = new ArrayList<>();
    private final List<Country> africa = new ArrayList<>();

    public Continent() {
        europe.add(new Country("Poland", new BigDecimal("38422346")));
        europe.add(new Country("Germany", new BigDecimal("82349400")));
        europe.add(new Country("France", new BigDecimal("67196000")));

        southAmerica.add(new Country("Brazil", new BigDecimal("207353391")));
        southAmerica.add(new Country("Argentina", new BigDecimal("44293293")));
        southAmerica.add(new Country("Colombia", new BigDecimal("47698524")));

        africa.add(new Country("Nigeria", new BigDecimal("190632261")));
        africa.add(new Country("Egypt", new BigDecimal("97041072")));
        africa.add(new Country("Ghana", new BigDecimal("27499924")));
    }
}
