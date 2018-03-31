package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        List<Country> countriesOfEurope = new ArrayList<>();
        Country poland = new Country("Poland", new BigDecimal("38422346"));
        Country germany = new Country("Germany", new BigDecimal("82349400"));
        Country france = new Country("France", new BigDecimal("67196000"));
        countriesOfEurope.add(poland);
        countriesOfEurope.add(germany);
        countriesOfEurope.add(france);

        List<Country> countriesOfSouthAmerica = new ArrayList<>();
        Country brazil = new Country("Brazil", new BigDecimal("207353391"));
        Country argentina = new Country("Argentina", new BigDecimal("44293293"));
        Country colombia = new Country("Colombia", new BigDecimal("47698524"));
        countriesOfSouthAmerica.add(brazil);
        countriesOfSouthAmerica.add(argentina);
        countriesOfSouthAmerica.add(colombia);

        List<Continent> continents = new ArrayList<>();
        Continent europe = new Continent("Europe", countriesOfEurope);
        Continent southAmerica = new Continent("South America", countriesOfSouthAmerica);
        continents.add(europe);
        continents.add(southAmerica);

        World world = new World(continents);
        BigDecimal expectedPopulation = new BigDecimal("487312954");

        Assert.assertEquals(world.getPeopleQuantity(), expectedPopulation);

    }
}
