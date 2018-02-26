package good.patterns.challanges.airportcase.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WroclawConnectionRepository {

    private final ArrayList<String> wroclawList = new ArrayList<>();

    public WroclawConnectionRepository() {
        wroclawList.add("Moskwa");
        wroclawList.add("Barcelona");
        wroclawList.add("Helsinki");
        wroclawList.add("Praga");
        wroclawList.add("Vienna");
        wroclawList.add("Paris");
        wroclawList.add("Frankfurt");

    }

    public ArrayList<String> getWroclawList() {
        return wroclawList;
    }
}
