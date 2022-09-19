package org.launchcode.Temperature;

public class Temperature {

    private double fahrenheit;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {

        double absoluteZeroFahrenheit = -459.67;

        if (aFahrenheit < absoluteZeroFahrenheit) {
//            System.out.println("Value is below absolute zero");
            try {
                throw new TemperatureException("That temperature is too low! (below absolute zero)");
            } catch (TemperatureException e) {
                e.printStackTrace();
            }
        }

        fahrenheit = aFahrenheit;
    }
}
