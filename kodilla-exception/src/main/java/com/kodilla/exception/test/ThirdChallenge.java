package com.kodilla.exception.test;

public class ThirdChallenge {
    public static void main(String[] args) {

        FlightSearcher flightSearcher = new FlightSearcher();

        try {
            flightSearcher.getFlight("Warsaw");
        } catch (RouteNotFoundException x) {
            System.out.println("Try again!");
        }
    }
}
