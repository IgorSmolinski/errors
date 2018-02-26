package good.patterns.challanges.airportcase.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Airport {

    private final String arrivalAirport, departureAirport;
    private final HashMap<String, ArrayList<String>> arrivalList, departureList;

    public Airport(String arrivalAirport, String departureAirport,
                   HashMap<String, ArrayList<String>> arrivalList,
                   HashMap<String, ArrayList<String>> departureList) {
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
        this.arrivalList = arrivalList;
        this.departureList = departureList;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public HashMap<String, ArrayList<String>> getArrivalList() {
        return arrivalList;
    }

    public HashMap<String, ArrayList<String>> getDepartureList() {
        return departureList;
    }
}
