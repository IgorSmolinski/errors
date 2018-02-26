package good.patterns.challanges.airportcase.repository;

import java.util.ArrayList;

public class CambridgeConnectionRepository {

    private final ArrayList<String> cambridgeList = new ArrayList<>();

    public CambridgeConnectionRepository() {
        cambridgeList.add("Warszawa");
        cambridgeList.add("Barcelona");
        cambridgeList.add("Berlin");
        cambridgeList.add("Vienna");
        cambridgeList.add("Frankfurt");



    }

    public ArrayList<String> getCambridgeList() {
        return cambridgeList;
    }
}


