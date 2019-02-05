package com.company;

public class Weight {

    private String kg;
    private String lbs;
    public Weight(String k,String l)
    {
        this.kg=k;
        this.lbs=l;
    }

    Converter c=new Converter();
    public void convert()
    {
        if(kg!=null)
        {
            System.out.println("Value in pounds is "+ c.kgToLbs(kg)+" lbs" );

        }
        else if(lbs!=null)
        {
            System.out.println("Value in kgs is "+ c.lbstoKg(lbs) + " kgs" );

        }


    }
}
