package com.kodilla.exception.test;

public class SearchForAFlightRunner {

    public static void main(String args[]) {
        SearchForAFlight searchForAFlight = new SearchForAFlight();
        Flight testFlight = new Flight("Vienna", "Berlin");
        Flight testFlight2 = new Flight("NY", "Skye");

        try {
            searchForAFlight.findFlight(testFlight);

        } catch (RouteNotFoundException e) {
            System.out.println("Airport not found in database");
        } finally {
            System.out.println("End of search.");
        }
        try {
            searchForAFlight.findFlight(testFlight2);

        } catch (RouteNotFoundException e) {
            System.out.println("Airport not found in database");
        } finally {
            System.out.println("End of search.");
        }
    }
}