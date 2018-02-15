package exception.test;



import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> tempMap = new HashMap<>();
        tempMap.put("London", true);
        tempMap.put("Barcelona", false);
        tempMap.put("Verona", false);
        tempMap.put("L.A.", true);
        tempMap.put("Chicago", true);
        tempMap.put("Wroclaw", false);

        long check = tempMap.keySet().stream()
                .filter(a -> a.equals(flight.arrivalAirport))
                .count();

        if (check == 1) {
            System.out.println("You can fly to :" + flight.arrivalAirport);
        }
        else {
            throw new RouteNotFoundException("There is no connection like this");
        }

    }
}
