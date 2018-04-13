package com.kodilla.good.patterns.challenges.Flights;

import java.time.LocalDateTime;

public class App {

    public static void main(final String[] args) {

        final Airport gdansk = new Airport("GDN", "Lech Walesa Airport Gdańsk");
        final Airport krakow = new Airport("KRK", "John Paul II International Airport Kraków-Balice");
        final Airport wroclaw = new Airport("WRO", "Copernicus Airport Wrocław");

        final Flight gdanskToWroclaw = new FlightClass(1, gdansk, wroclaw, LocalDateTime.of(2018, 04, 14, 15, 55),
                LocalDateTime.of(2018, 04, 14, 17, 15));
        final Flight gdanskToWroclaw2 = new FlightClass(2, gdansk, wroclaw, LocalDateTime.of(2018, 04, 18, 10, 15),
                LocalDateTime.of(2018, 04, 18, 11, 35));
        final Flight wroclawToGdansk = new FlightClass(3, wroclaw, gdansk, LocalDateTime.of(2018, 04, 15, 10, 05),
                LocalDateTime.of(2018, 04, 15, 11, 25));
        final Flight wroclawToGdansk2 = new FlightClass(4, wroclaw, gdansk, LocalDateTime.of(2018, 04, 19, 19, 10),
                LocalDateTime.of(2018, 04, 19, 20, 30));

        final ListOfFlights listOfFlights = new ListOfFlightsClass();
        listOfFlights.addFlight(gdanskToWroclaw);
        listOfFlights.addFlight(gdanskToWroclaw2);
        listOfFlights.addFlight(wroclawToGdansk);
        listOfFlights.addFlight(wroclawToGdansk2);

        final FlightSearchService flightSearchService = new FlighSearchServiceClass(listOfFlights);
        System.out.println("Flights from Gdańsk to Wrocław:");
        flightSearchService.searchFlightsFrom(new FlightSearching(gdansk)).forEach(System.out::println);
        System.out.println("Flights from Wrocław to Gdańsk:");
        flightSearchService.searchFlightsFrom(new FlightSearching(wroclaw)).forEach(System.out::println);

    }
}