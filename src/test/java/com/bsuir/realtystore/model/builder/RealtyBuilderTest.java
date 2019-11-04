package com.bsuir.realtystore.model.builder;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class RealtyBuilderTest {

    @Test
    void creationTest(){
        Long id = 1L;
        String town = "Minsk";
        String street = "Botanicheckaya";
        String streetNumber ="19/46";
        Long area = 10L;
        String owner = "+375297803698";
        Long cost = 36L;

        Realty realty =  new Realty.RealtyBuilder(id)
                .town(town)
                .street(street)
                .streetNumber(streetNumber)
                .area(area)
                .owner(owner)
                .cost(cost)
                .build();

        assertNotNull(realty);
        assertEquals(realty.getTown(), town);
        assertEquals(realty.getCost(), cost);
    }


    @Test
    void creationEmptyRealtyTest(){
        Long id = 1L;

        Realty realty =  new Realty.RealtyBuilder(id)
                .build();

        assertNotNull(realty);
        assertNull(realty.getTown());
        assertNull(realty.getCost());
    }
}
