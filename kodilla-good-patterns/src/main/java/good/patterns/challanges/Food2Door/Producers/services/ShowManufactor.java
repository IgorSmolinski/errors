package good.patterns.challanges.Food2Door.Producers.services;


public class ShowManufactor{


    private final OrderProcessingService orderProcessingService;


    public ShowManufactor(OrderProcessingService orderProcessingService) {
        this.orderProcessingService=orderProcessingService;
    }

    public void show(){
        System.out.println();


    }
}
