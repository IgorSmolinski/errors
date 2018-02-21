package good.patterns.challanges.Food2Door.Producers;

import good.patterns.challanges.Food2Door.Producers.model.*;
import good.patterns.challanges.Food2Door.Producers.services.*;


public class Application {

    static public void main(String[] args) {


        HealthyShop extra = new HealthyShop();
        GlutenFreeShop extra2 = new GlutenFreeShop();
        ExtraFoodShop extra3 = new ExtraFoodShop();

        //To można wrzucić do klasy MakeOrdersRetriver
        MakeAOrder temp = new MakeAOrder(extra2,"Rabitts", 20.0);
        MakeAOrder temp2 = new MakeAOrder(extra,"Milk", 50.0);
        MakeAOrder temp3 = new MakeAOrder(extra3,"Onion", 1.0);


        //ShowManufactor first = new ShowManufactor(extra2);
        //first.showing();

        OrderProcessing orderProcessing =new OrderProcessing(extra2, new SendEmail(),temp);
        OrderProcessing orderProcessing2 = new OrderProcessing(extra, new SendEmail(),temp2);
        OrderProcessing orderProcessing3 = new OrderProcessing(extra, new SendEmail(),temp3);

        extra2.process(orderProcessing);
        extra.process(orderProcessing2);

        extra3.get().entrySet().stream().forEach(System.out::println);
        System.out.println(temp3.getProduct());
        System.out.println(temp3.getValue());
        System.out.println(orderProcessing3.getOrderServices().get().get(temp3.getProduct()));
        extra3.process(orderProcessing3);

    }
}
