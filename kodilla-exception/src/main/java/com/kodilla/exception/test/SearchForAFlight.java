package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchForAFlight {
    public String findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightList = new HashMap<>();
        flightList.put("Berlin", true);
        flightList.put("Vienna", true);
        flightList.put("London", false);
        flightList.put("Tokyo", false);

            if (! flightList.containsKey(flight.getArrivalAirport())) {
                throw new RouteNotFoundException("There is no such Airport");
            }
            return "Airport found!";
    }
}
