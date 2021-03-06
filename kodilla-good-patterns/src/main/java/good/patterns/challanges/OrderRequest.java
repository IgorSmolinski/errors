package good.patterns.challanges;

import java.time.LocalDate;

public class OrderRequest {
    User user;
    LocalDate orderDate;

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
