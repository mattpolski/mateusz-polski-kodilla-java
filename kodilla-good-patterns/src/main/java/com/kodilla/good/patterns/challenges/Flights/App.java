package com.kodilla.good.patterns.challenges.Flights;

import java.time.LocalDateTime;

public class App {

    public static void main(final String[] args) {

        final Airport gdansk = new Airport("GDN", "Lech Walesa Airport Gdańsk");
        final Airport krakow = new Airport("KRK", "John Paul II International Airport Kraków-Balice");
        final Airport wroclaw = new Airport("WRO", "Copernicus Airport Wrocław");

        final Flight gdanskToWroclaw = new FlightClass(1, gdansk, wroclaw, null, LocalDateTime.of(2018, 4, 19, 15, 55),
                LocalDateTime.of(2018, 4, 19, 17, 15));
        final Flight gdanskToWroclaw2 = new FlightClass(2, gdansk, wroclaw, null, LocalDateTime.of(2018, 4, 18, 10, 15),
                LocalDateTime.of(2018, 4, 18, 11, 35));
        final Flight wroclawToGdansk = new FlightClass(3, wroclaw, gdansk, null, LocalDateTime.of(2018, 4, 17, 10, 5),
                LocalDateTime.of(2018, 4, 17, 11, 25));
        final Flight wroclawToGdansk2 = new FlightClass(4, wroclaw, gdansk, null, LocalDateTime.of(2018, 4, 19, 19, 10),
                LocalDateTime.of(2018, 4, 19, 20, 30));
        final Flight gdanskToWroclawThroughKrakow = new FlightClass(5, gdansk, wroclaw, krakow, LocalDateTime.of(2018, 4, 20, 18, 20),
                LocalDateTime.of(2018, 4, 20, 21, 10));


        final ListOfFlights listOfFlights = new ListOfFlightsClass();
        listOfFlights.addFlight(gdanskToWroclaw);
        listOfFlights.addFlight(gdanskToWroclaw2);
        listOfFlights.addFlight(wroclawToGdansk);
        listOfFlights.addFlight(wroclawToGdansk2);
        listOfFlights.addFlight(gdanskToWroclawThroughKrakow);

        final FlightSearchService flightSearchService = new FlighSearchServiceClass(listOfFlights);
        System.out.println("Flights from Gdańsk to Wrocław:");
        flightSearchService.searchFlightsFrom(new FlightSearching(gdansk)).forEach(System.out::println);
        System.out.println("Flights from Wrocław to Gdańsk:");
        flightSearchService.searchFlightsFrom(new FlightSearching(wroclaw)).forEach(System.out::println);
        System.out.println("Flights from Gdańsk to Kraków, through Wrocław:");
        flightSearchService.searchFlightsThrough(new FlightSearching(gdansk)).forEach(System.out::println);

    }
}