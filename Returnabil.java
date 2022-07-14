package com.itfactory.Produs.IngrijirePersonala;

public class Returnabil extends IngrijirePersonala{

    public Returnabil(double pretProdus) {
        super(pretProdus);
    }

    @Override
    int discountIngrijire() {
        return 0;
    }
    @Override
    public double pretFinalIngrijire(double pret ){
        return getPretProdus()-(getPretProdus()*discountIngrijire()/100);
    }
}
