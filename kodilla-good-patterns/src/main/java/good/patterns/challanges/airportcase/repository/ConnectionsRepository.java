package good.patterns.challanges.airportcase.repository;

import java.util.*;

public class ConnectionsRepository {

    private final HashMap<String,List<String>> connectionMap= new HashMap<>();


    private List<String>  wroclawConnectionRepository() {
        ArrayList<String> wroclawList = new ArrayList<>();
        wroclawList.add("Moskwa");
        wroclawList.add("Barcelona");
        wroclawList.add("Helsinki");
        wroclawList.add("Praga");
        wroclawList.add("Vienna");
        wroclawList.add("Paris");
        wroclawList.add("Frankfurt");

        return wroclawList;
    }

    public List<String> warszawaConnectionRepository() {
        List<String> warszawaList = new ArrayList<>();
        warszawaList.add("Gdynia");
        warszawaList.add("Helsinki");
        warszawaList.add("Berlin");
        warszawaList.add("Vienna");
        warszawaList.add("Frankfurt");
        warszawaList.add("Cambridge");

        return warszawaList;
    }

    public List<String>cambridgeConnectionRepository() {
        List<String> cambridgeList = new ArrayList<>();
        cambridgeList.add("Warszawa");
        cambridgeList.add("Barcelona");
        cambridgeList.add("Berlin");
        cambridgeList.add("Vienna");
        cambridgeList.add("Frankfurt");

        return cambridgeList;
    }


    public ConnectionsRepository(){
        connectionMap.put("Wrocław", wroclawConnectionRepository());
        //connectionMap.put("Barcelona", barcelonaConnectionRepository());
        connectionMap.put("Warszawa", warszawaConnectionRepository());
        connectionMap.put("Cambridge", cambridgeConnectionRepository());
    }

    public List<String> getConnections(String nameOfTheCity) {
        return connectionMap.get(nameOfTheCity);
    }
}

