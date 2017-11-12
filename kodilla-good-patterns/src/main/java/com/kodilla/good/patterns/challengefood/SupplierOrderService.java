package com.kodilla.good.patterns.challengefood;

public class SupplierOrderService {
    private NewOrder newOrder;
    private NewOrderInformation newOrderInformation;

    public SupplierOrderService(final NewOrder newOrder,
                                final NewOrderInformation newOrderInformation) {
        this.newOrder = newOrder;
        this.newOrderInformation = newOrderInformation;
    }

    public SupplierOrderDto process(final NewSupplierOrderRequest newSupplierOrderRequest) {
        boolean gotNewOrder = newOrder.createOrder(newSupplierOrderRequest.getNewSupplier(),
                newSupplierOrderRequest.getWhen());

        if(gotNewOrder) {
            newOrderInformation.sendInfoToSupplier(newSupplierOrderRequest.getNewSupplier());
            return new SupplierOrderDto(newSupplierOrderRequest.getNewSupplier(), true);
        } else {
            return new SupplierOrderDto(newSupplierOrderRequest.getNewSupplier(), false);
        }
    }
}