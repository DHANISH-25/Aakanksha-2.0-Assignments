public class Employees {
    int id;
    String name;
    String department;
    double salary;

    Employees(int i, String n) {
        id = i;
        name = n;
    }

    Employees(int i, String n, String d) {
        id = i;
        name = n;
        department = d;
    }

    Employees(int i, String n, String d, double s) {
        id = i;
        name = n;
        department = d;
        salary = s;
    }

    void display() {
        System.out.println("Employee id: " + id);
        System.out.println("Employee name: " + name);
        System.out.println("Employee department: " + department);
        System.out.println("Employee salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {
        Employees em = new Employees(58947, "Krishna Sharma");
        Employees em1 = new Employees(57894, "Dhanish Kumar", "Java Deverloper");
        Employees em2 = new Employees(98756, "Braj Gopal Das", "java", 59876.00);

        em.display();
        em1.display();
        em2.display();
    }

}
