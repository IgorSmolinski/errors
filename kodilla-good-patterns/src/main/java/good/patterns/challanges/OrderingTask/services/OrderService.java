package good.patterns.challanges.OrderingTask.services;

import good.patterns.challanges.OrderingTask.model.User;

import java.time.LocalDate;

public interface OrderService {
    boolean order(User user, LocalDate orderDate);
}
