package good.patterns.challanges.Food2Door.Producers.Repository;


import good.patterns.challanges.Food2Door.Producers.model.Shops;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository {

    private Map<String, Double> tempmap = new HashMap<>();


    public ProductRepository() {
        tempmap.put(Shops.ExtraFoodShop.name()+":Potatos", 20.0);
        tempmap.put(Shops.ExtraFoodShop.name()+":Tomatos", 14.0);
        tempmap.put(Shops.ExtraFoodShop.name()+":Garlic", 5.0);
        tempmap.put(Shops.ExtraFoodShop.name()+":Onion", 19.0);
        tempmap.put(Shops.HealthyShop.name()+":Eggs", 12.0);
        tempmap.put(Shops.HealthyShop.name()+":Milk", 90.0);
        tempmap.put(Shops.HealthyShop.name()+":Cheese", 10.2);
        tempmap.put(Shops.HealthyShop.name()+":Bread", 40.0);
        tempmap.put(Shops.GlutenFreeShop.name()+":Chickens", 12.0);
        tempmap.put(Shops.GlutenFreeShop.name()+":Eggs", 90.0);
        tempmap.put(Shops.GlutenFreeShop.name()+":Ducks", 10.2);
        tempmap.put(Shops.GlutenFreeShop.name()+":Rabitts", 40.0);
    }

    public Double getQuantity(Shops name, String product){
        return tempmap.get(name.name()+":"+product);

    }

    public void reduceQuantity(Shops name, String product, Double value){
        tempmap.put(name.name()+":"+product,getQuantity(name, product)-value);
    }

    public void show(Shops name){
        tempmap.entrySet().stream()
                .map(a->a.getKey())  //Jak rozdzielić Enum od klucza, żeby można było filtrować listę?
                .forEach(System.out::println);
    }
}




