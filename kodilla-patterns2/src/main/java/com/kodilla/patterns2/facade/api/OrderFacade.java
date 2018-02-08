package com.kodilla.patterns2.facade.api;

import com.kodilla.patterns2.facade.Order;
import com.kodilla.patterns2.facade.ShopService;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderFacade {
    @Autowired
    private ShopService shopService;
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacade.class);

    public void processOrder(final OrderDto order, final Long userId) throws OrderProcessingException {
        boolean wasError = false;
        long orderId = shopService.openOrder(userId);
        LOGGER.info("Registering new order, ID: " + orderId);
        if (orderId <0) {
            LOGGER.info(OrderProcessingException.ERR_NOT_AUTHORIZED);
            wasError = true;
            throw new OrderProcessingException(OrderProcessingException.ERR_NOT_AUTHORIZED);
        }
    }
}
