package good.patterns.challanges.airportcase.services;

import good.patterns.challanges.airportcase.model.Airport;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;


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

    /*
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

          airport.getConnectionList()
         .entrySet().stream()
               .filter(a->a.getKey().equals(airport.getArrivalAirport()))
                .map(a->a.getValue())
                  //.forEach(System.out::println);   //sprawdzanie co jest na liście
                .filter(a->a.equals(airport.getConnectionList()
                  //     .entrySet().stream()
                    //    .filter(b->b.getKey().equals(airport.getDepartureAirport()))
                      //  .map(b->b.getValue()))).toArray();


        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");*/

        return transferList;
    }
}
