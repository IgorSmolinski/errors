package good.patterns.challanges;

import java.time.LocalDate;

public class ProductOrderService {

    private SendingNotification sendingNotification;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService (final SendingNotification sendingNotification,
                                final OrderService orderService,
                                final OrderRepository orderRepository){
        this.orderRepository=orderRepository;
        this.orderService=orderService;
        this.sendingNotification=sendingNotification;
    }

    public OrderDto process (final OrderRequest orderRequest){
        boolean isInProcess = orderService.order(orderRequest.getUser(), orderRequest.getOrderDate());

        if(isInProcess) {
            sendingNotification.send(orderRequest.getUser());
            orderRepository.putOrder2Repository(orderRequest);
            return new OrderDto(orderRequest.getUser(), true);
        }else {

            return new OrderDto(orderRequest.getUser(), false);
        }

    }


}
