package good.patterns.challanges.airportcase.repository;

import java.util.*;

public class ConnectionsRepository {

    private final HashMap<String,ArrayList<String>> connectionMap= new HashMap<>();

    private final WroclawConnectionRepository wroclawConnectionRepository = new WroclawConnectionRepository();
    private final WarszawaConnectionRepository warszawaConnectionRepository = new WarszawaConnectionRepository();
    private final BarcelonaConnectionRepository barcelonaConnectionRepository = new BarcelonaConnectionRepository();
    private final CambridgeConnectionRepository cambridgeConnectionRepository = new CambridgeConnectionRepository();


    public ConnectionsRepository(){
        connectionMap.put("Wrocław", wroclawConnectionRepository.getWroclawList());
        connectionMap.put("Barcelona", barcelonaConnectionRepository.getBarcelonaList());
        connectionMap.put("Warszawa", warszawaConnectionRepository.getWarszawaList());
        connectionMap.put("Cambridge", cambridgeConnectionRepository.getCambridgeList());
    }

    public HashMap<String, ArrayList<String>> getConnectionMap() {
        return connectionMap;
    }
}
