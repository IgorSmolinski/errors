package good.patterns.challanges.airportcase.services;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import good.patterns.challanges.airportcase.model.Airport;
import good.patterns.challanges.airportcase.repository.ConnectionsRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;


public class SearchingTransfer {

    private final ConnectionsRepository connectionsRepository;

    public SearchingTransfer(ConnectionsRepository connectionsRepository) {
        this.connectionsRepository = connectionsRepository;
    }


    public Collection<String> transferProcess(String arrivalAirport, String departureAirport){
        Collection<String> departureList=connectionsRepository.getConnections(departureAirport);
        Collection<String> arrivalList=connectionsRepository.getConnections(arrivalAirport);

    ArrayList<String> transferList = new ArrayList<>(arrivalList);
    transferList.retainAll(departureList);



          return arrivalList.stream()
                  .filter(departureList::contains)
                  .collect(Collectors.toList());

    }
}
