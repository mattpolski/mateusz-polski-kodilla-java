package com.kodilla.good.patterns.challenges.Flights;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class FlighSearchServiceClass implements FlightSearchService {

    private final ListOfFlights listOfFlights;

    public FlighSearchServiceClass(ListOfFlights listOfFlights) {
        this.listOfFlights = listOfFlights;
    }

    @Override
    public List<Flight> searchFlightsTo(FlightSearching flightSearching) {
        final Airport arrivalAirport = flightSearching.getAirport();
        return listOfFlights.getFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> searchFlightsFrom(FlightSearching flightSearching) {
        final Airport departureAirport = flightSearching.getAirport();
        return listOfFlights.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> searchFlightsThrough(FlightSearching flightSearching) {
        final Airport airport = flightSearching.getAirport();
        return null;
    }
}
