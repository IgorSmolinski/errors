package good.patterns.challanges.OrderingTask;

import good.patterns.challanges.OrderingTask.model.User;

import java.time.LocalDate;

public class ShoesOrder implements OrderService {

    @Override
    public boolean order(User user, LocalDate orderDate) {
        System.out.println("Ordering shoes for: " + user.getName() + " "
                + user.getSurname() + " date of order: " + orderDate);
        return true;

    }
}
