package good.patterns.challanges.airportcase.repository;

import java.util.ArrayList;
import java.util.List;

public class WarszawaConnectionRepository {

    private final List<String> warszawaList = new ArrayList<>();

    public WarszawaConnectionRepository() {
        warszawaList.add("Wrocław");
        warszawaList.add("Gdynia");
        warszawaList.add("Helsinki");
        warszawaList.add("Berlin");
        warszawaList.add("Vienna");

    }
}
