package com.kodilla.good.patterns.challenges.Flights;

import java.util.List;

interface FlightSearchService {

    List<Flight> searchFlightsTo (String to);
    List<Flight> searchFlightsFrom (String from);
    List<Flight> searchFlightsBy (String from, String by, String to);

}