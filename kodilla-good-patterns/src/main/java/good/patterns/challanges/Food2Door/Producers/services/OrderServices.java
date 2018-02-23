package good.patterns.challanges.Food2Door.Producers.services;

import good.patterns.challanges.Food2Door.Producers.model.Order;

public interface OrderServices {

    void process(Order order);
    void info();

}
