public class ElectricityBill {
    String name;
    double unit;

    ElectricityBill(String n, double u) {
        name = n;
        unit = u;
    }

    void bill() {
        System.out.println("your unit consumption: " + unit);
        double electricityBill = unit * 8;
        System.out.println("Your Electiricity bill: " + electricityBill);
    }

    public static void main(String[] args) {
        ElectricityBill eb = new ElectricityBill("Dhanish", 56.55);
        eb.bill();
    }
}
