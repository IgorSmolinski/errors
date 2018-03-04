package good.patterns.challanges.airportcase;

import good.patterns.challanges.airportcase.model.Airport;
import good.patterns.challanges.airportcase.repository.ConnectionsRepository;
import good.patterns.challanges.airportcase.services.SearchingTransfer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/*
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

*/

public class Application {

    static public void main (String[] args){

        ConnectionsRepository connectionsRepository = new ConnectionsRepository();
        SearchingTransfer searchingTransfer = new SearchingTransfer(connectionsRepository);

        Collection<String> temp = searchingTransfer.transferProcess("Wrocław","Warszawa");

        temp.stream().forEach(System.out::println);

        /*
        Airport connection1 = new Airport("Warszawa", "Wrocław",connectionList);
        connection1.process();
        Airport connection2 = new Airport("Wrocław", "Barcelona",connectionList);
        connection2.process();
        Airport connection3 = new Airport("Warszawa", "Barcelona",connectionList);
        connection3.process();
        Airport connection4 = new Airport("Cambridge", "Barcelona",connectionList);
        connection4.process();
        Airport connection5 = new Airport("Barcelona", "Cambridge",connectionList);
        connection5.process();
        Airport connection6 = new Airport("Cambridge", "Wrocław",connectionList);
        connection6.process();
        */
    }
}










