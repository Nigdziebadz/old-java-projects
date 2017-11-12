package com.kodilla.good.patterns.challengefood;

public class Application {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        NewSupplierOrderRequest sampleOrderRequest = orderRequestRetriever.retrieve();

        SupplierOrderService orderProcessor = new SupplierOrderService(new
                NewOrderService(), new SendOrderInformation());
        orderProcessor.process(sampleOrderRequest);
    }
}
