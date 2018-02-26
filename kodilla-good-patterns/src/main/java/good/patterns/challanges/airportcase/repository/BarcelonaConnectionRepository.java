package good.patterns.challanges.airportcase.repository;

import java.util.ArrayList;
import java.util.List;

public class BarcelonaConnectionRepository {

    private final List<String> barcelonaList = new ArrayList<>();

    public BarcelonaConnectionRepository() {
        barcelonaList.add("Wrocław");
        barcelonaList.add("Gdynia");
        barcelonaList.add("Helsinki");
        barcelonaList.add("Warszawa");
        barcelonaList.add("Vienna");

    }
}
