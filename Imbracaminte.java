package com.itfactory.Produs.Imbracaminte;

import com.itfactory.Produs.Produs;

public abstract class Imbracaminte extends Produs {
 private String Imbracaminte;

    public Imbracaminte(double pretProdus) {
        super(pretProdus);
    }

    public String getImbracaminte()
    {
       return Imbracaminte;
    }

    public void setImbracaminte(String Imbracaminte)
    {
        this.Imbracaminte = Imbracaminte;
    }


    protected abstract int discountImbracaminte();

    public double pretFinalImbracaminte ( double pretFinal){
        return pretFinal-(pretFinal*discountImbracaminte())/100;
    }
}
