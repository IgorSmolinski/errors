package good.patterns.challanges.Food2Door.Producers.model;

import good.patterns.challanges.Food2Door.Producers.model.Order;
import good.patterns.challanges.Food2Door.Producers.model.PossibleOrderDto;
import good.patterns.challanges.Food2Door.Producers.services.OrderProcessingService;
import good.patterns.challanges.Food2Door.Producers.services.OrderServices;


public class ExtraFoodShop implements OrderServices {
     static String name = "Extra Food Shop";
     static String description ="Extra Big Potatos";
     private final OrderProcessingService orderProcessingService;


    public ExtraFoodShop(OrderProcessingService orderProcessingService) {
        this.orderProcessingService = orderProcessingService;
    }

    public void process(Order order) {
            PossibleOrderDto temp = orderProcessingService.checkOrder(order);

            if (temp.isPossible()) {
                orderProcessingService.processOrder(order);
            } else
                System.out.println("Go and change smth.");
        }


     public void info(){
            System.out.println(name);
            System.out.println(description);
         }




}

