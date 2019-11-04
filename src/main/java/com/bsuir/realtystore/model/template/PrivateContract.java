package com.bsuir.realtystore.model.template;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class PrivateContract extends PrepareContract {
    private Date start;
    private Date finish;
    private long rentalPeriod;

    @Override
    void chooseRealty() {
        System.out.println("choose realty for PRIVATE contract");
    }

    @Override
    void setRenting() {
        System.out.println("set renting for PRIVATE contract");

    }

    @Override
    void setRentor() {
        System.out.println("set rentor for PRIVATE contract");

    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    @Override
    void countRentalPeriod() {
        long diff = start.getTime() - finish.getTime();
        rentalPeriod = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

    }

    public PrivateContract(Date start, Date finish) {
        this.start = start;
        this.finish = finish;
    }

    @Override
    public String toString() {
        return "PrivateContract{" +
                "start=" + start +
                ", finish=" + finish +
                ", rentalPeriod=" + rentalPeriod +
                '}';
    }
}
