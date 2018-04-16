package com.kodilla.good.patterns.challenges.Flights;

import java.time.LocalDateTime;
import java.util.Objects;

public class FlightClass implements Flight {


    private final int flightId;
    private final Airport departureAirport;
    private final Airport arrivalAirport;
    private final Airport throughAirport;
    private final LocalDateTime departureTime;
    private final LocalDateTime arrivalTime;

    public FlightClass(int flightId, Airport departureAirport, Airport arrivalAirport, Airport throughAirport, LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this.flightId = flightId;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.throughAirport = throughAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }



    @Override
    public int getFlightId() {
        return flightId;
    }

    @Override
    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public Airport getDepartureAirport() {
        return departureAirport;
    }

    @Override
    public Airport getThroughAirport() {
        return throughAirport;
    }

    @Override
    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return "Flight Id: " + flightId +
                ", Departure Airport : " + departureAirport +
                ", Arrival airport: " + arrivalAirport +
                ", Through airport: " + throughAirport +
                ", Departure time: " + departureTime +
                ", Arrival time: " + arrivalTime;
    }

    @Override
    public int hashCode() {

        return Objects.hash(flightId);
    }
}
