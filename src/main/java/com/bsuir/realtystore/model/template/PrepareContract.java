package com.bsuir.realtystore.model.template;

//template
public abstract class PrepareContract {

    final void createContract() {
        chooseRealty();
        setRenting();
        setRentor();
        countRentalPeriod();
    }

    abstract void chooseRealty();

    abstract void setRenting();

    abstract void setRentor();

    abstract void countRentalPeriod();
}
