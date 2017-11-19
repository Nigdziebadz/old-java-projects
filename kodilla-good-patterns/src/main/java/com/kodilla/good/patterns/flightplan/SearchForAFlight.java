package com.kodilla.good.patterns.flightplan;

public class SearchForAFlight {

    public static void main(String args[]) {
        FlightRequestRetriever searchForAFlight = new FlightRequestRetriever();

        searchForAFlight.getFlightList().stream()
                .filter(flight -> flight.departureAirport == "Gdansk")
                .forEach(System.out::println);
        System.out.println("End of flights from Gdansk");

        searchForAFlight.getFlightList().stream()
                .filter(flight -> flight.arrivalAirport == "Gdansk")
                .forEach(System.out::println);
        System.out.println("End of flights to Gdansk");

    }

}
