package good.patterns.challanges.airportcase.services;

import good.patterns.challanges.airportcase.model.Airport;
import good.patterns.challanges.airportcase.model.DirectConnectionDto;
import good.patterns.challanges.airportcase.repository.ConnectionsRepository;

import java.util.List;
import java.util.stream.Collectors;

public class SearchingConnection {


    private ConnectionsRepository connectionsRepository;

    public SearchingConnection(ConnectionsRepository connectionsRepository) {

        this.connectionsRepository = connectionsRepository;
    }

    public List<DirectConnectionDto> connectionProcess(String cityName) {

        return connectionsRepository.getConnections(cityName).stream()
                .map(city->new DirectConnectionDto(cityName, city, true))
                .collect(Collectors.toList());
    }
}
