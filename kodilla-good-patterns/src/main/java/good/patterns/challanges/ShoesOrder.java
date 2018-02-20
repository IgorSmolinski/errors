package good.patterns.challanges;

import java.time.LocalDate;

public class ShoesOrder implements OrderService {

    @Override
    public boolean order(User user, LocalDate orderDate) {
        System.out.println("Ordering shoes for: " + user.name + " "
                + user.surname + " date of order: " + orderDate);
        return true;

    }
}
