/*20\. Create a `Vehicle` class with vehicle number, model, and rental price per day. Initialize the details using a 
constructor and create methods to calculate the total rental amount based on the number of days and apply a discount for rentals exceeding 5 days. */

class Vehicle {
    String vehicleNumber;
    String vehicleModel;
    double rentalPricePerDay;
    int rentalDay;
    double totalRentalAmount;

    Vehicle(String vn, String vm, double rppd, int rd) {
        vehicleNumber = vn;
        vehicleModel = vm;
        rentalPricePerDay = rppd;
        rentalDay = rd;
    }

    void totalRentalAmount() {
        totalRentalAmount = rentalPricePerDay * rentalDay;
        System.out.println("Total Rental Amount: " + totalRentalAmount);
    }

    void discount() {
        double discount = 0;

        if (rentalDay > 5) {
            discount = totalRentalAmount * 2 / 100;
            totalRentalAmount -= discount;

            System.out.println("Discount: " + discount);
            System.out.println("Your Total Rental Amount: " + totalRentalAmount);
        } else {
            System.out.println("Your are not eligible for discount.");
        }
    }

    public static void main(String[] args) {
        Vehicle vc = new Vehicle("54DK648", "2458Supra", 256.00, 6);
        System.out.println("Vehicle Number: " + vc.vehicleNumber);
        System.out.println("Vehicle Model: " + vc.vehicleModel);
        vc.totalRentalAmount();
        vc.discount();
    }
}
