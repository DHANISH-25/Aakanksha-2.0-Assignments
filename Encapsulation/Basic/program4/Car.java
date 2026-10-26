/*   Create a Car class with speed limit (0–200). */
public class Car {
    private double speed;

    public void setSpeed(double speed){
        this.speed = speed;
        
        if (speed >= 0 && speed <= 200) {
            System.out.println("Speed limit maintained correctly.");
        }else{
            System.out.println("You are out of the speed limit.");
        }
    }

    public double getSpeed(){
        return speed;
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.setSpeed(180);
        System.out.println(c.getSpeed());

        c.setSpeed(250);
        System.out.println(c.getSpeed());
    }
}
