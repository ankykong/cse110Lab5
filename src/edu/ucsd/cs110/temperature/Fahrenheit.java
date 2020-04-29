package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float cTemp = getValue();
        cTemp -= 32;
        cTemp = cTemp * 5 / 9;
        return new Celsius(cTemp);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        return "" + getValue() + " F";
    }
}
