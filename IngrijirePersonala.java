package com.itfactory.Produs.IngrijirePersonala;

import com.itfactory.Produs.Produs;

public abstract class IngrijirePersonala extends Produs {

    private String IngrijirePersonala;

    public IngrijirePersonala(double pretProdus) {
        super(pretProdus);
    }

    public String getIngrijirePersonala()
    {
        return IngrijirePersonala;
    }

    public void setIngrijirePersonala(String ingrijirePersonala)
    {
        IngrijirePersonala = ingrijirePersonala;
    }

    abstract int discountIngrijire();

    public abstract double pretFinalIngrijire(double pret);
}


