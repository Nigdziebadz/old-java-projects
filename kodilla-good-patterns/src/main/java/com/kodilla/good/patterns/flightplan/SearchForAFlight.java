package com.kodilla.good.patterns.flightplan;

public class SearchForAFlight {

    public static void main(String args[]) {

        System.out.println("Flight From Gdansk");
        System.out.println(FlightService.findFlightFrom("Gdansk"));

        System.out.println("Flight To Gdansk");
        System.out.println(FlightService.findFlightTo("Gdansk"));

        System.out.println("Flight From Gdansk to Wroclaw");
        System.out.println(FlightService.findFlightThrough("Gdansk", "Wroclaw", "Krakow"));


    }

}
