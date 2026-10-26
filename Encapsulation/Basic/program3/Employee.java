/*Create an Employee class with salary and prevent salary < 10000. */
public class Employee {
    private double salary;

    public void setSalary(double salary){
        if (salary >= 10000) {
            this.salary = salary;
        }else{
            System.out.println("Invalid Salary! salary must be 10000 and high.");
        }
    }

    public double getSalary(){
        return salary;
    }

    public static void main(String[] args) {
        Employee ba = new Employee();

        ba.setSalary(4600);
        System.out.println("Balance: " + ba.getSalary());

        ba.setSalary(45000);
        System.out.println("Balance: " + ba.getSalary());
    }
}
