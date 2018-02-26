package good.patterns.challanges.airportcase.repository;

import java.util.*;

public class ConnectionsRepository {
private final Map<String,String> connectionMap= new HashMap<>();
    private final HashSet

    public ConnectionsRepository(){
        connectionMap.put("Wrocław",
        connectionMap.put("Wrocław", "Warszawa");
        connectionMap.put("Wrocław", "Barcelona");
    }
}
