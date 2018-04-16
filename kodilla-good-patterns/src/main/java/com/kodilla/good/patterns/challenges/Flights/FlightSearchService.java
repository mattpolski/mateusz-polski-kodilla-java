package com.kodilla.good.patterns.challenges.Flights;

import java.util.List;

interface FlightSearchService {


    List<Flight> searchFlightsTo (final FlightSearching flightSearching);
    List<Flight> searchFlightsFrom (final FlightSearching flightSearching);
    List<Flight> searchFlightsThrough (final FlightSearching flightSearching);

}
