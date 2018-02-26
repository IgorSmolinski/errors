package good.patterns.challanges.OrderingTask.services;

import good.patterns.challanges.OrderingTask.model.User;

public class MailNotification implements SendingNotification {

    @Override
    public void send(User user){
        System.out.println("User login: " + user.getLogin() + " Your order was made");
    };
}
