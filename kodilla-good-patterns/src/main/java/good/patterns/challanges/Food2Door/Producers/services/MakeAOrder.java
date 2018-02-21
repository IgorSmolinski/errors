package good.patterns.challanges.Food2Door.Producers.services;

import good.patterns.challanges.Food2Door.Producers.model.OrderServices;

public class MakeAOrder {
    private OrderServices manufactor;
    private String product;
    private Double value;

    public MakeAOrder(OrderServices manufactor, String product, Double value) {
        this.manufactor = manufactor;
        this.product = product;
        this.value = value;
    }

    public OrderServices getManufactor() {
        return manufactor;
    }

    public String getProduct() {
        return product;
    }

    public Double getValue() {
        return value;
    }

}
