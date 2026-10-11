/*20. Create a **Complete Payroll Management System** using an `Employee` class containing `empId`, `name`, `department`, `designation`, `basicSalary`, 
`hra`, `da`, `tax`, and `netSalary`. Implement **default and parameterized constructors, constructor overloading, `this()` constructor chaining, copy 
constructor, validation, and separate methods for salary calculation**, and create multiple employee objects using different constructors to display their 
complete payroll details.*/



public class Employeees {
    int empId;
    String name;
    String department;
    String designation;
    double basicSalary;
    double hra;
    double da;
    double tax;
    double netSalary;


    Employeees() {
        empId = 101;
        name = "Rahul";
        department = "IT";
        designation = "Developer";
        basicSalary = 25000.0;

        calculateSalary();
    }


    Employeees(int id, String n, String dept) {
        this();

        empId = id;
        name = n;
        department = dept;
        designation = "Trainee";
        basicSalary = 20000.0;

        calculateSalary();
    }


    Employeees(int id, String n, String dept, double salary) {
        this();

        empId = id;
        name = n;
        department = dept;
        designation = "Employee";
        basicSalary = salary;

        calculateSalary();
    }


    Employeees(int id, String n, String dept,
             String desig, double salary) {
        empId = id;
        name = n;
        department = dept;
        designation = desig;
        basicSalary = salary;

        validate();
        calculateSalary();
    }


    Employeees(Employeees e) {
        this(e.empId, e.name, e.department,
             e.designation, e.basicSalary);
    }


    void validate() {
        if (empId <= 0) {
            throw new IllegalArgumentException(
                "Employee ID must be positive."
            );
        }

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Employee name cannot be empty."
            );
        }

        if (department == null || department.trim().isEmpty()) {   calculateSalary();
            throw new IllegalArgumentException(
                "Department cannot be empty."
            );
        }

        if (designation == null || designation.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Designation cannot be empty."
            );
        }

        if (basicSalary < 0) {
            throw new IllegalArgumentException(
                "Basic salary cannot be negative."
            );
        }
    }


    void calculateHRA() {
        hra = basicSalary * 20 / 100;
    }


    void calculateDA() {
        da = basicSalary * 10 / 100;
    }


    void calculateTax() {
        tax = basicSalary * 5 / 100;
    }


    void calculateSalary() {
        validate();
        calculateHRA();
        calculateDA();
        calculateTax();

        netSalary = basicSalary + hra + da - tax;
    }


    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Designation : " + designation);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA         : " + hra);
        System.out.println("DA          : " + da);
        System.out.println("Tax         : " + tax);
        System.out.println("Net Salary  : " + netSalary);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        // Object using default constructor
        Employeees e1 = new Employeees();


        Employeees e2 = new Employeees(102, "Amit", "HR");


        Employeees e3 = new Employeees(
            103, "Priya", "Finance", 40000.0
        );


        Employeees e4 = new Employeees(
            104, "Sneha", "IT", "Manager", 50000.0
        );

        Employeees e5 = new Employeees(e4);

        System.out.println("EMPLOYEE 1");
        e1.display();

        System.out.println("EMPLOYEE 2");
        e2.display();

        System.out.println("EMPLOYEE 3");
        e3.display();

        System.out.println("EMPLOYEE 4");
        e4.display();

        System.out.println("EMPLOYEE 5 (COPIED)");
        e5.display();
    }
}
