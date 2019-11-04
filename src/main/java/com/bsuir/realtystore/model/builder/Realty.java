package com.bsuir.realtystore.model.builder;

import com.bsuir.realtystore.model.composite.CatalogComponent;

public class Realty extends CatalogComponent {
    private Long id;
    private String town;
    private String street;
    private String streetNumber;
    private Long area;
    private String owner;
    private Long cost;

    private Realty(RealtyBuilder realtyBuilder) {
        super();
        this.id = realtyBuilder.id;
        this.town = realtyBuilder.town;
        this.street = realtyBuilder.street;
        this.streetNumber = realtyBuilder.streetNumber;
        this.area = realtyBuilder.area;
        this.owner = realtyBuilder.owner;
        this.cost = realtyBuilder.cost;
    }

    public static class RealtyBuilder {
        private final Long id;

        private String town;
        private String street;
        private String streetNumber;
        private Long area;
        private String owner;
        private Long cost;

        public RealtyBuilder(Long id) {
            this.id = id;
        }

        public RealtyBuilder town(String town) {
            this.town = town;
            return this;
        }

        public RealtyBuilder street(String street) {
            this.street = street;
            return this;
        }

        public RealtyBuilder streetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public RealtyBuilder area(Long area) {
            this.area = area;
            return this;
        }

        public RealtyBuilder owner(String owner) {
            this.owner = owner;
            return this;
        }

        public RealtyBuilder cost(Long cost) {
            this.cost = cost;
            return this;
        }

        public Realty build() {
            Realty realty = new Realty(this);
            return realty;
        }

    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getStreet() {
         return street;
    }

    @Override
    public String getTown() {
        return town;
    }

    @Override
    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    @Override
    public void print() {
        System.out.println("Realty{" +
                "id=" + id +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", area=" + area +
                ", owner='" + owner + '\'' +
                ", cost=" + cost +
                '}');
    }

    @Override
    public String toString() {
        return "Realty{" +
                "id=" + id +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", area=" + area +
                ", owner='" + owner + '\'' +
                ", cost=" + cost +
                '}';
    }
}
