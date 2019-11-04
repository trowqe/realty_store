package com.bsuir.realtystore.model.composite;

public abstract class CatalogComponent {
    public void add(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("Cannot add item to catalog.");
    }

    public void remove(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("Cannot remove item from catalog.");
    }

    public Long getId() {
        throw new UnsupportedOperationException("Cannot return id.");
    }

    public String getTown() {
        throw new UnsupportedOperationException("Cannot return town.");
    }

    public String getStreet() {
        throw new UnsupportedOperationException("Cannot return street.");
    }

    public Long getCost(){    throw new UnsupportedOperationException("Cannot return price.");}

    public void print() {
        throw new UnsupportedOperationException("Cannot print.");
    }

}
