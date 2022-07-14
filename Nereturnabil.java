package com.itfactory.Produs.IngrijirePersonala;

public class Nereturnabil extends IngrijirePersonala{
    public Nereturnabil(double pretProdus) {
        super(pretProdus);
    }



    @Override
    int discountIngrijire() {
        return 20;
    }
    public double pretFinalIngrijire(double pret ){
        return getPretProdus()-(getPretProdus()*discountIngrijire()/100);
    }
}
