public class Employee {
    String name;
    int id;
    double salary;
    void employeeDetails(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;

        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + this.salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.employeeDetails("Dhanish Kumar", 4576, 46000);
    }
}
