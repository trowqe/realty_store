package com.bsuir.realtystore.model.template;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CommercialContract extends PrepareContract {
    private Date start;
    private Date finish;
    private long rentalPeriod;

    @Override
    void chooseRealty() {
        System.out.println("choose realty for COMMERCIAL contract");
    }

    @Override
    void setRenting() {
        System.out.println("set renting for COMMERCIAL contract");

    }

    @Override
    void setRentor() {
        System.out.println("set rentor for COMMERCIAL contract");

    }

    public CommercialContract(Date start, Date finish) {
        this.start = start;
        this.finish = finish;
    }

    @Override
    void countRentalPeriod() {
        long diff = start.getTime() - finish.getTime();
        rentalPeriod = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public String toString() {
        return "CommercialContract{" +
                "start=" + start +
                ", finish=" + finish +
                ", rentalPeriod=" + rentalPeriod +
                '}';
    }
}
