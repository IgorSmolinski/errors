package good.patterns.challanges.OrderingTask.repository;

import good.patterns.challanges.OrderingTask.model.OrderRequest;
import good.patterns.challanges.OrderingTask.model.User;

import java.time.LocalDate;

public class DataRetriver {

    public OrderRequest retrive() {

        User user = new User("Igor", "Smolinski", "Smola");
        LocalDate orderDate = LocalDate.now();


        return new OrderRequest(user, orderDate);
    }
}
