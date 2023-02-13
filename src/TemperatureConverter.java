public class TemperatureConverter {
    public void toCelsius(double fahrenheit){
        double toCelsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Convert fahrenheit: " + fahrenheit + "\ncelsius: "+ toCelsius);
    }
    public void toFahrenheit(double celsius){
        double toFahrenheit = celsius * 9 / 5 + 32;
        System.out.println("Convert celsius: " +celsius +"\nfahrenheit"+ toFahrenheit);
    }
}
