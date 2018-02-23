package good.patterns.challanges.Food2Door.Producers;

import good.patterns.challanges.Food2Door.Producers.Repository.ProductRepository;
import good.patterns.challanges.Food2Door.Producers.model.*;
import good.patterns.challanges.Food2Door.Producers.services.*;


public class Application {

    static public void main(String[] args) {

        ProductRepository productRepository = new ProductRepository();
        OrderProcessingService first = new OrderProcessingService(new SendEmail(),productRepository);

        HealthyShop extra = new HealthyShop(first);
        GlutenFreeShop extra2 = new GlutenFreeShop(first);
        ExtraFoodShop extra3 = new ExtraFoodShop(first);



        Order temp = new Order(Shops.GlutenFreeShop ,"Rabitts", 266.0);
        Order temp2 = new Order(Shops.HealthyShop, "Eggs", 50.0);
        Order temp3 = new Order(Shops.ExtraFoodShop,"Onion", .70);


        extra.process(temp);
        extra2.process(temp3);
        extra3.process(temp2);
        productRepository.getQuantity(Shops.ExtraFoodShop, "Onion");
        productRepository.show(Shops.ExtraFoodShop);



    }
}
