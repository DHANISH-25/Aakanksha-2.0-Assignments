
/*19. Create an `Employee` class with `empId`, `name`, `department`, `basicSalary`, and `designation`, and implement multiple 
constructors using **constructor overloading and `this()` constructor chaining**. Create separate methods to calculate HRA, DA, tax, and final net salary.*/

public class Employeee {
    int empId;
    String name;
    String department;
    double basicSalary;
    String designation;

    // Default constructor
    Employeee() {
        empId = 101;
        name = "Rahul";
        department = "IT";
        basicSalary = 25000.0;
        designation = "Developer";
    }

    Employeee(int id, String n, String dept) {
        this();

        empId = id;
        name = n;
        department = dept;
        basicSalary = 20000.0;
        designation = "Trainee";
    }

    Employeee(int id, String n, String dept, double salary) {
        this();

        empId = id;
        name = n;
        department = dept;
        basicSalary = salary;
        designation = "Employee";
    }

    Employeee(int id, String n, String dept, double salary, String desig) {
        this();

        empId = id;
        name = n;
        department = dept;
        basicSalary = salary;
        designation = desig;
    }

    double calculateHRA() {
        return basicSalary * 20 / 100;
    }

    double calculateDA() {
        return basicSalary * 10 / 100;
    }

    double calculateTax() {
        return basicSalary * 5 / 100;
    }

    double calculateNetSalary() {
        return basicSalary + calculateHRA()
               + calculateDA() - calculateTax();
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Designation: " + designation);
        System.out.println("HRA: " + calculateHRA());
        System.out.println("DA: " + calculateDA());
        System.out.println("Tax: " + calculateTax());
        System.out.println("Net Salary: " + calculateNetSalary());
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Employeee e1 = new Employeee();
        Employeee e2 = new Employeee(102, "Amit", "HR");
        Employeee e3 = new Employeee(103, "Priya", "Finance", 40000.0);
        Employeee e4 = new Employeee(
            104, "Sneha", "IT", 50000.0, "Manager"
        );

        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}