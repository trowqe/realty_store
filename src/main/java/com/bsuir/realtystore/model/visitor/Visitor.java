package com.bsuir.realtystore.model.visitor;

import com.bsuir.realtystore.model.builder.Realty;

public interface Visitor {
    void visit(Realty realty);
}
