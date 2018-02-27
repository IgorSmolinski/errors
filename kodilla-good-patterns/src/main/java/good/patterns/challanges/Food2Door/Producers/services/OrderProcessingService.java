package good.patterns.challanges.Food2Door.Producers.services;

import good.patterns.challanges.Food2Door.Producers.Repository.ProductRepository;
import good.patterns.challanges.Food2Door.Producers.model.Order;
import good.patterns.challanges.Food2Door.Producers.model.PossibleOrderDto;


public class OrderProcessingService {

    private final NotificationService notification;
    private final ProductRepository productRepository;

    public OrderProcessingService(NotificationService notification, ProductRepository productRepository) {
        this.notification = notification;
        this.productRepository = productRepository;
    }


    public PossibleOrderDto checkOrder(Order order) {

        if (productRepository.getQuantity(order.getManufactor(), order.getProduct()) > order.getValue()) {
            return new PossibleOrderDto(order, true);

        } else {
            System.out.println("There is not enough products in stock.\nOnly "
                    + productRepository.getQuantity(order.getManufactor(), order.getProduct()) + "  available products are in Stock");
            return new PossibleOrderDto(order, false);
        }
    }

    public void processOrder(Order order){
        notification.send();
        productRepository.reduceQuantity(order.getManufactor(), order.getProduct(), order.getValue());
    }

}
