package good.patterns.challanges;

import java.time.LocalDate;

public class BookOrder implements OrderService{

    @Override
    public boolean order(User user, LocalDate orderDate){
        System.out.println("Ordering book for: " + user.name + " "
                        + user.surname + " date of order: " + orderDate);
        return true;
    }
}
