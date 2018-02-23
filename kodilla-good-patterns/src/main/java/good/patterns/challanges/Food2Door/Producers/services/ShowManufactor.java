package good.patterns.challanges.Food2Door.Producers.services;

import good.patterns.challanges.Food2Door.Producers.Repository.ProductRepository;
import good.patterns.challanges.Food2Door.Producers.model.Shops;
import good.patterns.challanges.OrderingTask.OrderService;

public class ShowManufactor{

    private final Shops shop;


    public ShowManufactor(Shops shop) {
        this.shop=shop;
    }

    public void show(){
        System.out.println(shop.name());


    }
}
