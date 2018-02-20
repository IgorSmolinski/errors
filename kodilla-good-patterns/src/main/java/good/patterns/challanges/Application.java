package good.patterns.challanges;



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
