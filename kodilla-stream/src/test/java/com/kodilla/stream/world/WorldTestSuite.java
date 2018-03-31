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

        List<Continent> continents = new ArrayList<>();
        Continent europe = new Continent("Europe", countriesOfEurope);

        World world = new World(continents);
        BigDecimal expectedPopulation = new BigDecimal("187967746"),

        Assert.assertEquals(world.getPeopleQuantity(), expectedPopulation);



    }
}
