package good.patterns.challanges.OrderingTask;

import good.patterns.challanges.OrderingTask.model.OrderRequest;

public interface OrderRepository {

    boolean putOrder2Repository (OrderRequest orderRequest);
}
