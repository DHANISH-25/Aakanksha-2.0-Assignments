public class Vehicle {
    String vehicleNo;
    String brand;
    String model;
    String fuelType;
    double price;

    //vehicles with different levels of information. Display the complete vehicle details.
    Vehicle(String v, String b){
        vehicleNo = v;
        brand = b;
    }

    Vehicle(String v, String b, String m){
        vehicleNo = v;
        brand = b;
        model = m;
    }

    Vehicle(String v, String b, String m, String ft, double p){
        vehicleNo = v;
        brand = b;
        model = m;
        fuelType = ft;
        price = p;
    }

    void display(){
        System.out.println("\nVehicle number: " + vehicleNo);
        System.out.println("Vehicle brand: " + brand);
        System.out.println("Vehicle model: " + model);
        System.out.println("Vehicle fuel type: " + fuelType);
        System.out.println("Vehicle price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Vehicle vh = new Vehicle("01-OD 6584", "Activa", "Scooty", "Petrol", 124000.00);
        Vehicle vh2 = new Vehicle("03-OD 6584", "Hero", "Scooter");
        Vehicle vh1 = new Vehicle("02-OD 6584", "Glamour");

        vh.display();
        vh1.display();
        vh2.display();
    }

}
