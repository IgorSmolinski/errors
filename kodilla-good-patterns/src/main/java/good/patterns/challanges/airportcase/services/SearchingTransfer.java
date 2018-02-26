package good.patterns.challanges.airportcase.services;

import good.patterns.challanges.airportcase.model.Airport;

import java.util.ArrayList;
import java.util.Collection;


public class SearchingTransfer {

    private final Airport airport;


    public SearchingTransfer(Airport airport) {
        this.airport = airport;
    }

    public Collection<String> transferProcess(){
        Collection<String> departureList=airport.getConnectionList().get(airport.getDepartureAirport());
        Collection<String> arrivalList=airport.getConnectionList().get(airport.getArrivalAirport());

    ArrayList<String> transferList = new ArrayList<>(arrivalList);
    transferList.retainAll(departureList);

        /*Collection<String> transferFlight = airport.getConnectionList()
            .entrySet().stream()
            .filter(a->a.getKey().equals(airport.getArrivalAirport()))
            .map(a->a.getValue()
            .map(a->a.retainAll(departureList))

        return transferFlight; */

        return transferList;
    }
}
