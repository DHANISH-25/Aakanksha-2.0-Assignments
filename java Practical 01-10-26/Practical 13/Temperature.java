/*13 Write a Java program to create a `Temperature` class with methods to convert Celsius to Fahrenheit and Fahrenheit to Celsius.*/
public class Temperature {
    double farhenheitTemp;
    double celsiusTemp;

    void celsiusToFahrenheit(double celsiusTemp){
        farhenheitTemp = (celsiusTemp * 1.8) + 32;
    }

    void fahrenheitToCelsius(double farhenheitTemp){
        celsiusTemp = (farhenheitTemp - 32) / 1.8;
    }
    public static void main(String[] args) {
        Temperature tem = new Temperature();
        tem.celsiusToFahrenheit(28);
        tem.fahrenheitToCelsius(98);
        System.out.println("Temperature in Fahrenheit: " + tem.farhenheitTemp);
        System.out.println("Temperature in Fahrenheit: " + tem.celsiusTemp);
    }
}