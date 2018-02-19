package exception.main;

import exception.test.Flight;
import exception.test.FlightSearcher;
import exception.test.RouteNotFoundException;


import java.io.IOException;
import java.util.Map;
import java.util.stream.Stream;

public class FlightExceptionRunner {

    public static void main(String[] args) throws RouteNotFoundException {

        Flight flight = new Flight("Warszawa", "s");
        FlightSearcher flightSearcher = new FlightSearcher();

        Stream.of(new Integer[]{1,2,3,4,5}).filter(a->a.equals(5));

        try {
            flightSearcher.findFlight(flight);

        } catch (RouteNotFoundException e) {
            System.out.println("You can't go to : " + flight.getArrivalAirport() + "\n " + e.getMessage());


        }
    }
}

