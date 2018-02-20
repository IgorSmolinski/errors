package good.patterns.challanges.OrderingTask;

import java.time.LocalDate;

public interface OrderService {
    boolean order(User user, LocalDate orderDate);
}
