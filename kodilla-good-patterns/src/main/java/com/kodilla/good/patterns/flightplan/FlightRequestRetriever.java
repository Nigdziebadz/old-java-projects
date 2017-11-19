package com.kodilla.good.patterns.flightplan;

import java.util.HashSet;

public final class FlightRequestRetriever {
    private final HashSet<Flight> flightList = new HashSet<>();

    public FlightRequestRetriever() {
        Flight newFlight1 = new Flight("Gdansk", "Gdynia");
        Flight newFlight2 = new Flight("Gdansk", "Warszawa");
        Flight newFlight3 = new Flight("Gdansk", "Poznan");
        Flight newFlight4 = new Flight("Gdansk", "Katowice");
        Flight newFlight5 = new Flight("Warszawa", "Gdansk");
        Flight newFlight6 = new Flight("Poznan", "Katowice");
        Flight newFlight7 = new Flight("Katowice", "Gdansk");

        flightList.add(newFlight1);
        flightList.add(newFlight2);
        flightList.add(newFlight3);
        flightList.add(newFlight4);
        flightList.add(newFlight5);
        flightList.add(newFlight6);
        flightList.add(newFlight7);

    }

    public HashSet<Flight> getFlightList() {
        return new HashSet<>(flightList);
    }

}
