package good.patterns.challanges.Food2Door.Producers.services;

import good.patterns.challanges.Food2Door.Producers.model.OrderServices;


public class OrderProcessing {

    private OrderServices orderServices;
    private Notification notification;
    private MakeAOrder makeAOrder;

    public OrderProcessing(OrderServices orderServices, Notification notification, MakeAOrder makeAOrder) {
        this.orderServices = orderServices;
        this.notification = notification;
        this.makeAOrder = makeAOrder;
    }

    public OrderServices getOrderServices() {
        return orderServices;
    }

    public Notification getNotification() {
        return notification;
    }

    public MakeAOrder getMakeAOrder() {
        return makeAOrder;
    }

    public PossibleDto isItPossible() {
        Double availableQuantity = orderServices.get().entrySet().stream()
                .filter(a -> makeAOrder.getProduct().equals(a.getKey()))
                .map(a -> a.getValue())
                .reduce(0.0, (a, b) -> a + b);  //nie potrafię wyciągnąć tej liczny w inny sposób.

        System.out.println(availableQuantity);

        if (availableQuantity > makeAOrder.getValue()) {
            notification.send();
            return new PossibleDto(makeAOrder, true);

        } else {
            System.out.println("There is not enough products in stock.\nOnly "
                    + availableQuantity + "  available products are in Stock");
            return new PossibleDto(makeAOrder, false);
        }

    }

}
