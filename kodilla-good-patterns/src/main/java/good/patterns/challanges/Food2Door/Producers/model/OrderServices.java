package good.patterns.challanges.Food2Door.Producers.model;

import good.patterns.challanges.Food2Door.Producers.services.OrderProcessing;

import java.util.Map;

public interface OrderServices {

    void process(OrderProcessing orderProcessing);
    void info();
    Map<String, Double> get();

}
