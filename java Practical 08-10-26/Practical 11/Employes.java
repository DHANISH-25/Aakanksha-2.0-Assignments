class Employes{
    int id; 
    String name; 
    String department; 
    double salary;

    Employes(){
        System.out.println("Employee Details:");
    }

    Employes(int i, String n, String d, double s){
        this();
        id = i;
        name = n;
        department = d;
        salary = s;
        System.out.println("Id: " + id + " \nName: " + name + " \nDepartment: " + department + " \nSalary: " + salary);
    }

    public static void main(String[] args) {
        Employes em = new Employes(5698, "dhanish", "computer science", 59862.00);
    }
}