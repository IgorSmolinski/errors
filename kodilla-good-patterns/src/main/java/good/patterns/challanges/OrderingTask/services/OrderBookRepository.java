package good.patterns.challanges.OrderingTask.services;

import good.patterns.challanges.OrderingTask.model.OrderRequest;

import java.util.ArrayList;
import java.util.List;

public class OrderBookRepository implements OrderRepository{

    public boolean putOrder2Repository(OrderRequest orderRequest){

        List<OrderRequest> listOfBook = new ArrayList<>();
        listOfBook.add(orderRequest);
        return true;
    }


}
