package com.itfactory.Produs.Imbracaminte;

public class Accesoriu  extends Imbracaminte{

    public Accesoriu(double pretProdus) {
        super(pretProdus);
    }

    @Override
    protected int discountImbracaminte() {
    return 30;
    }


}
