package good.patterns.challanges.airportcase.repository;

import java.util.ArrayList;
import java.util.Collection;


public class WarszawaConnectionRepository {

    private final ArrayList<String> warszawaList = new ArrayList<>();

    public WarszawaConnectionRepository() {
        warszawaList.add("Gdynia");
        warszawaList.add("Helsinki");
        warszawaList.add("Berlin");
        warszawaList.add("Vienna");
        warszawaList.add("Frankfurt");
        warszawaList.add("Cambridge");

    }

    public ArrayList<String> getWarszawaList() {
        return warszawaList;
    }
}
