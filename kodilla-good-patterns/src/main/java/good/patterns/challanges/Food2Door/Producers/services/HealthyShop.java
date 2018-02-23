package good.patterns.challanges.Food2Door.Producers.services;

import good.patterns.challanges.Food2Door.Producers.Repository.ProductRepository;
import good.patterns.challanges.Food2Door.Producers.model.Order;

import java.util.Map;

public class HealthyShop implements OrderServices {
    private static final String name = "Healthy Shop";
    private static final String description ="Buying from Us make more Healthy.";
    private final OrderProcessingService orderProcessingService;

    public HealthyShop(OrderProcessingService orderProcessingService) {
        this.orderProcessingService = orderProcessingService;
    }

    public void process(Order order) {
        PossibleOrderDto temp = orderProcessingService.checkOrder(order);

        if (temp.isPossible()) {
            orderProcessingService.processOrder(order);

        } else
            System.out.println("Come on. You can do it better!");
    }

    public void info(){
        System.out.println(name);
        System.out.println(description);




    }
}

