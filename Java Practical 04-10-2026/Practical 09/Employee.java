public class Employee {
    int empId;
    String name ;
    double salary;

    Employee(int e,String n, double s){
        empId = e;
        name = n;
        salary = s;
    }

    void annualSalary() {
        double annualSalary = salary * 12;
        System.out.println("Employee annual salary: " + annualSalary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(100001,"rahul",46000.00);
        emp.annualSalary();
    }
}