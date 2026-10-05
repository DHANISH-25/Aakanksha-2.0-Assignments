public class Car {
    String brand;
    String model;
    String fuelType;

    Car(String b,String m, String f) {
        brand = b;
        model = m;
        fuelType = f;
    }

    void display() {
        System.out.println("Car brand: " + brand);
        System.out.println("Car model: " + model);
        System.out.println("Car fuel type: " + fuelType);
    }

    public static void main(String[] args) {
        Car ca = new Car("BMW","M4","diesel");
        ca.display();
    }
}