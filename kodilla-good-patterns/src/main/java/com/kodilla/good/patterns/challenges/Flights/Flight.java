package com.kodilla.good.patterns.challenges.Flights;

import java.time.LocalDateTime;

public interface Flight {

    int getFlightId();
    Airport getArrivalAirport();
    Airport getDepartureAirport();
    Airport getThroughAirport();
    LocalDateTime getArrivalTime();
    LocalDateTime getDepartureTime();

}
