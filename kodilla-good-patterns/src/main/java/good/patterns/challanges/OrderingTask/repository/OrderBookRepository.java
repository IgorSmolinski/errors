package good.patterns.challanges.OrderingTask.repository;

import good.patterns.challanges.OrderingTask.model.OrderRequest;
import good.patterns.challanges.OrderingTask.repository.OrderRepository;

import java.util.ArrayList;
import java.util.List;

public class OrderBookRepository implements OrderRepository {

    public boolean putOrder2Repository(OrderRequest orderRequest){

        List<OrderRequest> listOfBook = new ArrayList<>();
        listOfBook.add(orderRequest);
        return true;
    }


}
