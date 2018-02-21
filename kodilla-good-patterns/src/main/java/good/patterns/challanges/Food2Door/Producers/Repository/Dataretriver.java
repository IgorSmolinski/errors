package good.patterns.challanges.Food2Door.Producers.Repository;


import java.util.HashMap;
import java.util.Map;

public class Dataretriver {

    private Map<String,Double> tempmap = new HashMap<>();


    public Map<String,Double> gettingData() {
        tempmap.clear();
        tempmap.put("Potatos", 20.0);
        tempmap.put("Tomatos", 14.0);
        tempmap.put("Garlic", 5.0);
        tempmap.put("Onion", 19.0);

        return tempmap;
        }

        public Map<String,Double> gettingData2() {
            tempmap.clear();
            tempmap.put("Eggs", 12.0);
            tempmap.put("Milk", 90.0);
            tempmap.put("Cheese", 10.2);
            tempmap.put("Bread", 40.0);

            return tempmap;
        }
            public Map<String,Double> gettingData3() {
                tempmap.clear();
                tempmap.put("Chickens", 12.0);
                tempmap.put("Eggs", 90.0);
                tempmap.put("Ducks", 10.2);
                tempmap.put("Rabitts", 40.0);

                return tempmap;
        }
}




