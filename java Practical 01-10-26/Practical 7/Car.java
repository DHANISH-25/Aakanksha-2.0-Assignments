import java.util.Scanner;

public class Car{
    String carName = "BMW";
    String model = "M8";
    double price = 10000000;
    String colour = "Frost White";
    void start(){
        System.out.println("Your Car is Starting.....");
        System.out.println("Vroom Vroom");
    }

    void stop(){
        System.out.println("Your car has stopped");
        System.out.println("fussssssss");
    }

    void carInfo(){
        System.out.println("Car Name: " + carName);
        System.out.println("Model of the Car: " + model);
        System.out.println("Car Price: " + price);
        System.out.println("Car colour: " + colour);
    }

    public static void main(String[] args) {
        Car obj = new Car();
        Scanner sc = new Scanner(System.in);
        System.out.println("----- MENU -----");
        System.out.println("1.Car information");
        System.out.println("2.Start the car");
        System.out.println("3.Stop the car");
        System.out.println("Choose an option to perfom that task (1,2,3,4): ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                obj.carInfo();
                break;
            case 2:
                obj.start();
                break;
            case 3:
                obj.stop();
                break;
        
            default:
                System.out.println("Enter valid input...");
                break;
        }

        sc.close();
    }
}

