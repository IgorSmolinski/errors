package good.patterns.challanges.airportcase.services;

import good.patterns.challanges.airportcase.model.Airport;

import java.util.ArrayList;
import java.util.HashMap;

public class SearchingConnection {

    private final Airport airport;
    private final HashMap<String,ArrayList<String>> arrivalList = new HashMap<>();
    private final HashMap<String,ArrayList<String>> departureList = new HashMap<>();

    public SearchingConnection(Airport airport) {
        this.airport = airport;
    }

    public DirectConnectionDto process{

        String arrivalName = airport.getArrivalAirport();

        boolean directFlightPossible = airport.getDepartureList().entrySet().stream()
                .map(a->a.getValue())
                .map(a->a.stream())
                .anyMatch(a->a.equals(airport.getArrivalAirport()));

        return new DirectConnectionDto(arrivalName, airport.getDepartureAirport(), directFlightPossible)
    }

}
