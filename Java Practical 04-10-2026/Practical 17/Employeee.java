class Employeee {

    String name;
    double salary;
    double performanceRating;

    Employeee(String n, double s, double p) {
        name = n;
        salary = s;
        performanceRating = p;
    }

    double calculateBonus() {
        if (performanceRating >= 4.5) {
            return salary * 0.20;
        } else if (performanceRating >= 3.5) {
            return salary * 0.10;
        } else {
            return salary * 0.05;
        }
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + String.format("%.2f", salary));
        System.out.println("Performance Rating: " + performanceRating);
        System.out.println("Calculated Bonus: $" + String.format("%.2f", calculateBonus()));
        System.out.println();
    }

    public static void main(String[] args) {
        Employeee emp = new Employeee("Krishna", 60000.0, 6.5);

        emp.displayDetails();
    }
}
