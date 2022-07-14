package com.itfactory.Produs;

public abstract class Produs {

    private String numeProdus;
    private Double pretProdus;
    private int DiscountProdus;

    public Produs ( double pretProdus)
    {
        this.pretProdus = pretProdus;
    }

    private int DiscountProdus ()
    {
        if (DiscountProdus >= 0 && DiscountProdus <= 100)
        {
            System.out.println(DiscountProdus);
        }
        return DiscountProdus;
    }

    public String getNumeProdus()
    {
        return numeProdus;
    }

    public void setNumeProdus(String numeProdus)
    {
        this.numeProdus = numeProdus;
    }

    public Double getPretProdus()
    {
        return pretProdus;
    }

    public void setPretProdus(Double pretProdus)
    {
        this.pretProdus = pretProdus;
    }

    public int getDiscountProdus()
    {
        return DiscountProdus;
    }

    public void setDiscountProdus(int discountProdus)
    {
        this.DiscountProdus = discountProdus;
    }

}
