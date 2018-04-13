package com.kodilla.good.patterns.challenges.Flights;

import java.time.LocalDateTime;
import java.util.Objects;

public class FlightClass implements Flight {

    private final int flightId;
    private final Airport departureAirport;
    private final Airport arrivalAirport;
    private final LocalDateTime departureTime;
    private final LocalDateTime arrivalTime;


    public FlightClass(int flightId, Airport departureAirport, Airport arrivalAirport, LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this.flightId = flightId;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
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
    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return "FlightClass{" +
                "arrivalAirport=" + arrivalAirport +
                ", departureAirport=" + departureAirport +
                ", arrivalTime=" + arrivalTime +
                ", departureTime=" + departureTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightClass that = (FlightClass) o;
        return flightId == that.flightId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(flightId);
    }
}
