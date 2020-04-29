package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float fTemp = getValue();
        fTemp = fTemp * 9 / 5;
        fTemp += 32;
        return new Fahrenheit(fTemp);
    }

    public String toString()
    {
        return "" + getValue() + " C";

    }
}
