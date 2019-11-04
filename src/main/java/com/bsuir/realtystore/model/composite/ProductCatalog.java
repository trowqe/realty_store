package com.bsuir.realtystore.model.composite;

import java.util.ArrayList;

public class ProductCatalog extends CatalogComponent {
    private ArrayList<CatalogComponent> items = new ArrayList<>();
    private String town;

    public ProductCatalog(String town) {
        this.town = town;
    }

    @Override
    public String getTown() {
        return town;
    }

    @Override
    public void print() {
        for (CatalogComponent comp : items) {
            comp.print();
        }
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }
}



