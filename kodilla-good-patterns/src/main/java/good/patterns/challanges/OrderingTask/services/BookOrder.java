package good.patterns.challanges.OrderingTask.services;

import good.patterns.challanges.OrderingTask.model.User;

import java.time.LocalDate;

public class BookOrder implements OrderService{

    @Override
    public boolean order(User user, LocalDate orderDate){
        System.out.println("Ordering book for: " + user.getName() + " "
                        + user.getSurname() + " date of order: " + orderDate);
        return true;
    }
}
