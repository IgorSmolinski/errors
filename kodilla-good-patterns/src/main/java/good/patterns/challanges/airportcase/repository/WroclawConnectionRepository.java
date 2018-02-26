package good.patterns.challanges.airportcase.repository;

import java.util.ArrayList;
import java.util.List;

public class WroclawConnectionRepository {

    private final List<String> wroclawList = new ArrayList<>();

    public BarcelonaConnectionRepository() {
        wroclawList.add("Moskwa");
        wroclawList.add("Barcelona");
        wroclawList.add("Helsinki");
        wroclawList.add("Warszawa");
        wroclawList.add("Praga");

    }
}
