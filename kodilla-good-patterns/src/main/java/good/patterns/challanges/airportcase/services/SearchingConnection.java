package good.patterns.challanges.airportcase.services;

import good.patterns.challanges.airportcase.model.Airport;
import good.patterns.challanges.airportcase.model.DirectConnectionDto;

public class SearchingConnection {

    private final Airport airport;

    public SearchingConnection(Airport airport) {
        this.airport = airport;
    }

    public DirectConnectionDto connectionProcess() {

        boolean directFlightPossible = airport.getConnectionList()
                .entrySet().stream()
                .filter(a -> a.getKey().equals(airport.getDepartureAirport()))
                .flatMap(a->a.getValue().stream())
                .anyMatch(a -> a.equals(airport.getArrivalAirport()));

        return new DirectConnectionDto(airport.getArrivalAirport(), airport.getDepartureAirport(), directFlightPossible);

    }
}
