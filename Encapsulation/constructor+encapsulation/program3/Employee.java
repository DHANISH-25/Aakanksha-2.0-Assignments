public class Employee {
    private double salary;

    public Employee(double salary) {
        setSalary(salary);
    }

    public void setSalary(double salary) {
        if (salary >= 10000) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary! Salary must be at least 10000.");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(25000);
        Employee e2 = new Employee(8000);

        e1.display();
        e2.display();
    }
}
