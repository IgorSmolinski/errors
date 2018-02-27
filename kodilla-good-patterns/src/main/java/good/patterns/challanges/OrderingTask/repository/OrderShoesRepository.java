package good.patterns.challanges.OrderingTask.repository;

import good.patterns.challanges.OrderingTask.model.OrderRequest;

import java.util.ArrayList;
import java.util.List;

public class OrderShoesRepository implements OrderRepository {

    public boolean putOrder2Repository(OrderRequest orderRequest) {

        List<OrderRequest> listOfShoes = new ArrayList<>();
        listOfShoes.add(orderRequest);
        return true;
    }
}
