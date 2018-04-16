package com.kodilla.good.patterns.challenges.Flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchServiceClass implements FlightSearchService {

    private List<Flight> flights = new ArrayList<>();

    public FlightSearchServiceClass() {
        this.flights.add(new Flight("Warszawa", "Londyn"));
        this.flights.add(new Flight("Warszawa", "Gdańsk"));
        this.flights.add(new Flight("Warszawa", "Rzeszów"));
        this.flights.add(new Flight("Warszawa", "Kraków"));
        this.flights.add(new Flight("Kraków", "Wiedeń"));
    }

    @Override
    public List<Flight> searchFlightsTo(String to) {
        return flights.stream().
                filter(f -> f.getArrivalAirport().equals(to)).
                collect(Collectors.toList());
    }

    @Override
    public List<Flight> searchFlightsFrom(String from) {
        return flights.stream()
                .filter(f -> f.getDepartureAirport().equals(from))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> searchFlightsBy(String from, String by, String to) {
        List<Flight> fromList = flights.stream()
                .filter(f -> f.getDepartureAirport().equals(from))
                .filter(f -> f.getArrivalAirport().equals(by))
                .collect(Collectors.toList());

        List<Flight> toList = flights.stream()
                .filter(f -> f.getDepartureAirport().equals(by))
                .filter(f -> f.getArrivalAirport().equals(to))
                .collect(Collectors.toList());
        fromList.addAll(toList);
        return fromList;
    }
}