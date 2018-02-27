package good.patterns.challanges.OrderingTask;


import good.patterns.challanges.OrderingTask.model.OrderRequest;
import good.patterns.challanges.OrderingTask.repository.DataRetriver;
import good.patterns.challanges.OrderingTask.repository.OrderBookRepository;
import good.patterns.challanges.OrderingTask.repository.OrderShoesRepository;
import good.patterns.challanges.OrderingTask.services.*;

public class Application {


    public static void main (String[] args){

        DataRetriver dataRetriver = new DataRetriver();
        OrderRequest orderRequest = dataRetriver.retrive();


        ProductOrderService productOrderService = new ProductOrderService(new MailNotification(),
                new BookOrder(),new OrderBookRepository());
        productOrderService.process(orderRequest);

        ProductOrderService productOrderService2 = new ProductOrderService(new MailNotification(),
                new ShoesOrder(),new OrderShoesRepository());
        productOrderService2.process(orderRequest);

    }


}
