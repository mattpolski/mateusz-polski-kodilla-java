package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class World {
    private List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }
    List<Continent> continentList = new ArrayList<>();

    public World() {
    continentList.add(new Continent("Europe", Continent.getEurope()));
    continentList.add(new Continent("South America", Continent.getSouthAmerica()));
    continentList.add(new Continent("Africa", Continent.getAfrica()))
    }
}
