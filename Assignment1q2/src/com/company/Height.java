package com.company;

public class Height {

    private String inch;
    private String cm;
    public Height(String i,String c)
    {
        this.inch=i;
        this.cm=c;
    }

    Converter c=new Converter();
    public void convert()
    {
        if(inch!=null)
        {
            System.out.println("Value in cms is "+ c.inchToCm(inch)+" cm" );

        }
        else if(cm!=null)
        {
            System.out.println("Value in inch is "+ c.cmToInch(cm) + " inches" );

        }


    }
}
