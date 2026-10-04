public class Employee {

    int empId = 10000215;
    String name = "Dhanish Kumar";
    double salary = 56000.00;

    public void EmployeeDetails() {
        System.out.println("Emloyee name: " + empId);
        System.out.println("Employee name: " + name);
        System.out.println("Employee salary: " + salary);
    }

    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.EmployeeDetails();
    }
}
