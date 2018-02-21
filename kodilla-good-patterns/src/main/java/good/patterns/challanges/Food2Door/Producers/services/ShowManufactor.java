package good.patterns.challanges.Food2Door.Producers.services;

import good.patterns.challanges.Food2Door.Producers.model.OrderServices;

public class ShowManufactor{

    private OrderServices producer;


    public ShowManufactor(OrderServices producer) {
        this.producer = producer;
    }

    public void showing() {
                producer.info();

    }
}
