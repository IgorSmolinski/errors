package good.patterns.challanges.OrderingTask.model;

import good.patterns.challanges.OrderingTask.model.User;

import java.time.LocalDate;

public class OrderRequest {
    private final User user;
    private final LocalDate orderDate;

    public OrderRequest(User user, LocalDate orderDate) {
        this.user = user;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
