package good.patterns.challanges.Food2Door.Producers.model;

import good.patterns.challanges.Food2Door.Producers.model.Order;

public class PossibleOrderDto {
    private Order order;
    private boolean possible;

    public PossibleOrderDto(Order order, boolean possible) {
        this.order = order;
        this.possible = possible;
    }

    public Order getOrder() {
        return order;
    }

    public boolean isPossible() {
        return possible;
    }
}
