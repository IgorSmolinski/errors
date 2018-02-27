package good.patterns.challanges.airportcase.model;

import good.patterns.challanges.airportcase.services.SearchingConnection;
import good.patterns.challanges.airportcase.services.SearchingTransfer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Objects;

public class Airport {

    private final String arrivalAirport, departureAirport;
    private final HashMap<String, ArrayList<String>> connectionList;

    public Airport(String arrivalAirport, String departureAirport,
                   HashMap<String, ArrayList<String>> connectionList) {
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
        this.connectionList = connectionList;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public HashMap<String, ArrayList<String>> getConnectionList() {
        return connectionList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;
        Airport airport = (Airport) o;
        return Objects.equals(arrivalAirport, airport.arrivalAirport) &&
                Objects.equals(departureAirport, airport.departureAirport);
    }

    @Override
    public int hashCode() {

        return Objects.hash(arrivalAirport, departureAirport);
    }

    public void process(){

        SearchingConnection searchingConnection = new SearchingConnection(new Airport(getArrivalAirport(),
                getDepartureAirport(),getConnectionList()));

        DirectConnectionDto directConnectionDto = searchingConnection.connectionProcess();

        if(directConnectionDto.isDirectPossiblity()){
            System.out.println("**********************************");
            System.out.println("We have direct connection from: "
                    + directConnectionDto.getDepartureAirport() + " to "
                    + directConnectionDto.getArrivalAirport());
            System.out.println("**********************************");
            return;

        } else {
            SearchingTransfer searchingTransfer = new SearchingTransfer(new Airport(getArrivalAirport(),
                    getDepartureAirport(),getConnectionList()));
            Collection<String> transferCityList = searchingTransfer.transferProcess();
            System.out.println("**********************************");
            System.out.println("Sorry but we don't have direct connection on this route:");
            System.out.println(getDepartureAirport()+"->"+getArrivalAirport());
            System.out.println("We can offer You journey with transfer thru one of this city:");
            transferCityList.stream()
                    .forEach(System.out::println);
            System.out.println("**********************************");


        }

    }
}
