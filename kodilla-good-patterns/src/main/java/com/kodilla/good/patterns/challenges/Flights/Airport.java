package com.kodilla.good.patterns.challenges.Flights;

import java.util.Objects;

public class Airport {

    private final String iata;
    private final String name;

    public Airport(String iata, String name) {
        this.iata = iata;
        this.name = name;
    }

    public String getIata() {
        return iata;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(iata, airport.iata) &&
                Objects.equals(name, airport.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iata, name);
    }

    @Override
    public String toString() {
        return "Airport{" +
                "iata='" + iata + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
