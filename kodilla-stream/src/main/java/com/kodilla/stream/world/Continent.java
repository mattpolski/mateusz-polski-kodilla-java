package com.kodilla.stream.world;

import java.util.List;

public class Continent {
    private String nameOfContinent;
    private List<Country> listOfCountries;

    public Continent(String nameOfContinent, List<Country> listOfCountries) {
        this.nameOfContinent = nameOfContinent;
        this.listOfCountries = listOfCountries;
    }

    public List<Country> getListOfCountries() {
        return listOfCountries;
    }
}
