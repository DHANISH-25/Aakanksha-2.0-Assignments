public class Employee {
    int empId;
    String name;
    double salary;

    Employee() {
        empId = 56987;
        name = "Krishna Sharma";
        salary = 65875.00;
    }

    Employee(int ei, String n, double s) {
        empId = ei;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee name: " + name);
        System.out.println("Employee salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(5566, "Dhanish kumar", 56423);
        emp.display();
        Employee ep = new Employee();
        ep.display();
    }
}
