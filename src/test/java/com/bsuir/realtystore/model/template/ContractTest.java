package com.bsuir.realtystore.model.template;

import java.util.Calendar;
import java.util.Date;

public class ContractTest {
    public static void main(String[] args) {
        PrepareContract contract1 = new CommercialContract(new Date(), new Date(2020, Calendar.JANUARY, 10));
        contract1.createContract();

        PrepareContract contract2 = new PrivateContract(new Date(), new Date(2020, Calendar.JANUARY, 10));
        contract2.createContract();
    }
}
