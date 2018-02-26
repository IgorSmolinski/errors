package good.patterns.challanges.airportcase;

import good.patterns.challanges.airportcase.model.Airport;
import good.patterns.challanges.airportcase.repository.ConnectionsRepository;

import java.util.ArrayList;
import java.util.HashMap;


public class Application {

    static public void main (String[] args){

        ConnectionsRepository connectionsRepository = new ConnectionsRepository();
        HashMap<String, ArrayList<String>> connectionList = connectionsRepository.getConnectionMap();
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
    }
}
