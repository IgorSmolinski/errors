package good.patterns.challanges;

import java.time.LocalDate;

public interface OrderService {
    boolean order(User user, LocalDate orderDate);
}
