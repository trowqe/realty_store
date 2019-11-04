package com.bsuir.realtystore.model.facade;

import com.bsuir.realtystore.model.builder.Realty;

public class OrderServiceFacadeImpl implements OrderServiceFacade {
    public boolean placeOrder(int pId) {
        boolean orderFulfilled = false;
        Realty minskRealty =  new Realty.RealtyBuilder(1L)
                .town("Minsk")
                .street("street")
                .streetNumber("streetNumber")
                .area(45L)
                .owner("owner")
                .cost(45L)
                .build();


        if (InventoryService.isAvailable(minskRealty)) {
            System.out.println("realty " + minskRealty.toString() + "is available.");
            boolean paymentConfirmed = PaymentService.makePayment();
            if (paymentConfirmed) {
                System.out.println("Payment confirmed...");
                InsuranceService.insureProduct(minskRealty);
                System.out.println("Product insure...");
                orderFulfilled = true;
            }
        }
        return orderFulfilled;
    }
}