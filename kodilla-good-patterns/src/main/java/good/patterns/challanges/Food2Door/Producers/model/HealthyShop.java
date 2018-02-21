package good.patterns.challanges.Food2Door.Producers.model;

import good.patterns.challanges.Food2Door.Producers.Repository.Dataretriver;
import good.patterns.challanges.Food2Door.Producers.services.OrderProcessing;
import good.patterns.challanges.Food2Door.Producers.services.PossibleDto;

import java.util.Map;

public class HealthyShop implements OrderServices {
    static String name = "Healthy Shop";
    static String description ="Buying from Us make more Healthy.";

    private Map<String, Double> mapWithStock= new Dataretriver().gettingData2();


    public Map<String, Double> get() {
        return mapWithStock;
    }

    public void process(OrderProcessing orderProcessing) {
        PossibleDto temp = orderProcessing.isItPossible();
        String key = orderProcessing.getMakeAOrder().getProduct();
        Double beforeValue = mapWithStock.get(orderProcessing.getMakeAOrder().getProduct());
        Double afterValue = beforeValue - orderProcessing.getMakeAOrder().getValue();

        if (temp.isPossible()) {
            mapWithStock.replace(key, beforeValue, afterValue);
        } else
            System.out.println("Come on. You can do it better!");
    }

    public void info(){
        System.out.println(name);
        System.out.println(description);
        get().entrySet().stream()
                .forEach(System.out::println);
    }
}

