public class Converter {



    public String fahrenheitToCelsius(String f)
    {

       return Double.toString((Double.parseDouble(f) - 32) / 1.8);
    }

    public String celsiusToFahrenheit(String c)
    {
        return  Double.toString((Double.parseDouble(c) * 1.8) + 32);
    }
    public String fahrenheitToKelvin(String f)
    {
         return Double.toString( (Double.parseDouble(f) + 459.67) / 1.8);
    }

    public String kelvinToFahrenheit(String k)
    {
        return Double.toString((Double.parseDouble(k)* 1.8) - 459.67);
    }

    public String celsiusToKelvin(String c)
    {
        return Double.toString(Double.parseDouble(c) + 273.15);
    }

    public String kelvinToCelsius(String k)
    {
        return Double.toString(Double.parseDouble(k) - 273.15);
    }
}
