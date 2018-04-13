package com.kodilla.good.patterns.challenges.Flights;

import java.util.ArrayList;
import java.util.List;

public class ListOfFlightsClass implements ListOfFlights {

    private final List<Flight> flights = new ArrayList<>();

    @Override
    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    @Override
    public List<Flight> getFlights() {
        return flights;
    }
}
