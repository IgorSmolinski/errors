package good.patterns.challanges;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderBookRepository implements OrderRepository{

    public boolean putOrder2Repository(OrderRequest orderRequest){

        List<OrderRequest> listOfBook = new ArrayList<>();
        listOfBook.add(orderRequest);
        return true;
    }


}
