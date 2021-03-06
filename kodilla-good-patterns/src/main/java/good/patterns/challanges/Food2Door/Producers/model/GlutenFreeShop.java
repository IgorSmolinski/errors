package good.patterns.challanges.Food2Door.Producers.model;

import good.patterns.challanges.Food2Door.Producers.model.Order;
import good.patterns.challanges.Food2Door.Producers.model.PossibleOrderDto;
import good.patterns.challanges.Food2Door.Producers.services.OrderProcessingService;
import good.patterns.challanges.Food2Door.Producers.services.OrderServices;

public class GlutenFreeShop implements OrderServices {
    private static String name = "Gluten Free Shop";
    private static String description = "Gluten Free Products";
    private final OrderProcessingService orderProcessingService;

    public GlutenFreeShop(OrderProcessingService orderProcessingService) {
        this.orderProcessingService = orderProcessingService;
    }

    public void process(Order order) {
        PossibleOrderDto temp = orderProcessingService.checkOrder(order);

        if (temp.isPossible()) {
            orderProcessingService.processOrder(order);
        } else
            System.out.println("Order cannot be accepted.");
    }

    public void info() {
        System.out.println(name);
        System.out.println(description);

    }
}
