package good.patterns.challanges.Food2Door.Producers.services;


import good.patterns.challanges.Food2Door.Producers.model.Order;

public class ShowManufactor{


    private final Order order;


    public ShowManufactor(Order order) {
        this.order= order
    }

    public void show(){
        System.out.println(order.getManufactor());


    }
}
