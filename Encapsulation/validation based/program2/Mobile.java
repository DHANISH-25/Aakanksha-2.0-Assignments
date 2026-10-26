public class Mobile {
    private int battery;

    public Mobile(int battery) {
        setBattery(battery);
    }

    public void setBattery(int battery) {
        if (battery >= 0 && battery <= 100) {
            this.battery = battery;
        } else {
            System.out.println("Battery percentage must be between 0 and 100.");
        }
    }

    public int getBattery() {
        return battery;
    }

    public void display() {
        System.out.println("Battery: " + battery + "%");
    }

    public static void main(String[] args) {

        Mobile m1 = new Mobile(80);
        Mobile m2 = new Mobile(120);

        m1.display();
        m2.display();
    }
}
