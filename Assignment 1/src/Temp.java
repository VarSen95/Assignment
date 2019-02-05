public class Temp {
    private String Fahrenheit;
    private String Celsius;
    private String Kelvin;


    public Temp(String f,String c,String k)
    {
        this.Fahrenheit=f;
        this.Celsius=c;
        this.Kelvin=k;
    }

    Converter c=new Converter();
    public void convert()
    {
       if(Fahrenheit!=null)
       {
           System.out.println("Value in Celsius is "+ c.fahrenheitToCelsius(Fahrenheit)+" Celcius" );
           System.out.println("Value in Kelvin is "+ c.fahrenheitToKelvin(Fahrenheit)+" Kelvin" );
       }
       else if(Celsius!=null)
       {
           System.out.println("Value in Fahrenheit is "+ c.celsiusToFahrenheit(Celsius) + " Fahrenheit" );
           System.out.println("Value in Kelvin is "+ c.celsiusToKelvin(Celsius)+" Kelvin" );

       }
       else if(Kelvin!=null)
       {
           System.out.println("Value in Celsius is "+ c.kelvinToCelsius(Kelvin)+" Celcius" );
           System.out.println("Value in Fahrenheit is "+ c.kelvinToFahrenheit(Kelvin)+" Fahrenheit" );
       }

    }


}
