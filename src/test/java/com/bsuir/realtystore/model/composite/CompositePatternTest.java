package com.bsuir.realtystore.model.composite;


import com.bsuir.realtystore.model.builder.Realty;
import org.junit.jupiter.api.Test;


public class CompositePatternTest {
    @Test
    public void testPrint() throws Exception {

        CatalogComponent minskRealty1 =  new Realty.RealtyBuilder(1L)
                .town("Minsk")
                .street("street")
                .streetNumber("streetNumber")
                .area(45L)
                .owner("owner")
                .cost(45L)
                .build();

        CatalogComponent minskRealty2 =  new Realty.RealtyBuilder(2L)
                .town("Minsk")
                .street("street")
                .streetNumber("streetNumber")
                .area(45L)
                .owner("owner")
                .cost(45L)
                .build();


        CatalogComponent BrestRealty = new Realty.RealtyBuilder(1L)
                .town("Brest")
                .street("street")
                .streetNumber("streetNumber")
                .area(45L)
                .owner("owner")
                .cost(45L)
                .build();

        CatalogComponent minskCatalog = new ProductCatalog("Minsk");
        minskCatalog.add(minskRealty1);
        minskCatalog.add(minskRealty2);


        CatalogComponent mainCatalog=new ProductCatalog("all");
        mainCatalog.add(minskCatalog);
        mainCatalog.add(BrestRealty);

        mainCatalog.print();

    }
}
