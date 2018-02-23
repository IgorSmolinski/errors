package good.patterns.challanges.Food2Door.Producers.services;

public class SendEmail implements NotificationService {

    public void send(){

        System.out.println("The order was send.");
    }
}
