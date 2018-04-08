package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearcher {
    private HashMap<String, Boolean> mapOfFlights = new HashMap<>();

    public FlightSearcher() {

        mapOfFlights.put("Boston", true);
        mapOfFlights.put("New York", true);
        mapOfFlights.put("Chicago", false);
        mapOfFlights.put("Houston", false);
        mapOfFlights.put("Los Angeles", true);
    }

    Boolean findFlight(Flight flight) {
        return mapOfFlights.get(flight.getArrivalAirport());
    }

    public Boolean getFlight(String key) throws RouteNotFoundException {
        if (mapOfFlights.containsKey(key)) {
            return mapOfFlights.get(key);
        } else {
            throw new RouteNotFoundException();
        }
    }
}
