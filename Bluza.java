package com.itfactory.Produs.Imbracaminte;

public class Bluza extends Imbracaminte{

    public Bluza(double pretProdus) {
        super(pretProdus);
    }

    @Override
    protected int discountImbracaminte() {
        return 20;
    }

}
