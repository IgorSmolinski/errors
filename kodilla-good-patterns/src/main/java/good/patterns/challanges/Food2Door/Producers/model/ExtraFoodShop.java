package good.patterns.challanges.Food2Door.Producers.model;

import good.patterns.challanges.Food2Door.Producers.Repository.Dataretriver;
import good.patterns.challanges.Food2Door.Producers.services.OrderProcessing;
import good.patterns.challanges.Food2Door.Producers.services.PossibleDto;

import java.util.Map;


public class ExtraFoodShop implements OrderServices {
     static String name = "Extra Food Shop";
     static String description ="Extra Big Potatos";

     private Map<String, Double>  mapWithStock= new Dataretriver().gettingData();


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
                System.out.println("Go and change smth.");
        }


     public void info(){
        System.out.println(name);
        System.out.println(description);
        get().entrySet().stream()
                .forEach(System.out::println);
         }




}

