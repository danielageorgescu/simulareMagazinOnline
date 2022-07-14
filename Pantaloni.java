package com.itfactory.Produs.Imbracaminte;

import com.itfactory.Produs.Produs;

public class Pantaloni extends Imbracaminte{


    public Pantaloni(double pretProdus) {
        super(pretProdus);
    }

    @Override
  protected int discountImbracaminte() {
        return 10;
    }


}
