package com.bsuir.realtystore.model.visitor;

import com.bsuir.realtystore.model.builder.Realty;

public class PriceVisitor implements Visitor {
    @Override
    public void visit(Realty realty) {
        Long costBefore = realty.getCost();
        Long costAfter = costBefore+10L;
        realty.setCost(costAfter);
    }
}
