package good.patterns.challanges;

public class MailNotification implements SendingNotification {

    @Override
    public void send(User user){
        System.out.println("User login: " + user.login + " Your order was made");
    };
}
