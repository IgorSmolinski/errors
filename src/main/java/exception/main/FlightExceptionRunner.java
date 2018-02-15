package exception.main;

import exception.test.Flight;
import exception.test.FlightSearcher;
import exception.test.RouteNotFoundException;


import java.io.IOException;
import java.util.Map;

public class FlightExceptionRunner {

    public static void main(String[] args) {

        Flight flight = new Flight("Warszawa", "London");
        FlightSearcher flightSearcher = new FlightSearcher();


        try {
            flightSearcher.findFlight(flight);

        } catch (RouteNotFoundException e) {
            System.out.println("You can't go to : " + flight.getArrivalAirport());


        }
    }
}
