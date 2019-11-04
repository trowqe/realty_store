package com.bsuir.realtystore.model.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderFulfillmentControllerTest {

    @Test
    public void testOrderProduct() throws Exception {
        OrderFulfillmentController controller = new OrderFulfillmentController();
        controller.facade = new OrderServiceFacadeImpl();
        controller.orderProduct(1);
        boolean result = controller.orderFulfilled;
        assertTrue(result);
    }
}
