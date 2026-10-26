public class Temperature {
    private double temperature;

    public Temperature(double temperature) {
        setTemperature(temperature);
    }

    public void setTemperature(double temperature) {
        if (temperature >= -273.15) {
            this.temperature = temperature;
        } else {
            System.out.println("Temperature cannot be below absolute zero (-273.15°C).");
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public void display() {
        System.out.println("Temperature: " + temperature + "°C");
    }

    public static void main(String[] args) {

        Temperature t1 = new Temperature(25);
        Temperature t2 = new Temperature(-300);

        t1.display();
        t2.display();
    }
}