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




        Order temp = new Order(Shops.GlutenFreeShop ,"Rabitts", 20.0);
        Order temp2 = new Order(Shops.HealthyShop, "Eggs", 50.0);
        Order temp3 = new Order(Shops.ExtraFoodShop,"Onion", .70);


        extra.process(temp);
        extra.process(temp3);
        productRepository.show(Shops.ExtraFoodShop);




        ShowManufactor showing = new ShowManufactor(Shops.HealthyShop);
        showing.show();

        //OrderProcessingService orderProcessingService =new OrderProcessingService();
        //OrderProcessingService orderProcessingService2 = new OrderProcessingService(extra, new SendEmail(),temp2);
        //OrderProcessingService orderProcessingService3 = new OrderProcessingService(extra, new SendEmail(),temp3);


        //System.out.println(temp3.getProduct());
        //System.out.println(temp3.getValue());


    }
}
