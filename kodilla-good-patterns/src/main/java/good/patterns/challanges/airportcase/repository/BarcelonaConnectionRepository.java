package good.patterns.challanges.airportcase.repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;


public class BarcelonaConnectionRepository {

    private final ArrayList<String> barcelonaList = new ArrayList<>();

    public BarcelonaConnectionRepository() {
        barcelonaList.add("Wrocław");
        barcelonaList.add("Gdynia");
        barcelonaList.add("Helsinki");
        barcelonaList.add("Vienna");
        barcelonaList.add("Paris");
        barcelonaList.add("Cambridge");
    }

    public ArrayList<String> getBarcelonaList() {
        return barcelonaList;
    }
}
