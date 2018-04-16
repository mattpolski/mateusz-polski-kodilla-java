package com.kodilla.good.patterns.challenges.Flights;

import java.time.LocalDateTime;

public class App {

    public static void main(final String[] args) {

        final FlightSearchService flightSearchService = new FlightSearchServiceClass();
        System.out.println("Flights from Warszawa: " + flightSearchService.searchFlightsFrom("Warszawa"));
        System.out.println("Flights to Londyn: " + flightSearchService.searchFlightsTo("Londyn"));
        System.out.println("Flights from Warszawa to Wiedeń: " + flightSearchService.searchFlightsBy("Warszawa", "Kraków", "Wiedeń"));

    }
}